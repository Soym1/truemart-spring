package com.truemart.truemartspring.Config;

import com.truemart.truemartspring.Service.Impl.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class AppSecurityConfig {
    @Autowired
    private CustomUserDetailService customUserDetailService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Bean
    synchronized public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/","/login","/templates/**","/chat/**").permitAll()
                .and()
                .authorizeHttpRequests()
                .requestMatchers("/shop/**").authenticated()
//                .and().formLogin()
                .and().formLogin().loginPage("/login").usernameParameter("email").passwordParameter("password")
                .defaultSuccessUrl("/",true)
                .failureUrl("/login?error")
                .and().build();
    }
    @Bean
    synchronized public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.eraseCredentials(false)
                .userDetailsService(customUserDetailService)
                .passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }
}