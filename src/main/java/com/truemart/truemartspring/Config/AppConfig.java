package com.truemart.truemartspring.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.truemart.truemartspring.Controller.ChatSocketController;
import com.truemart.truemartspring.DTO.productDTO;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    @Bean
    public productDTO productDTO(){
        return new productDTO();
    }
    @Bean
    public ModelAndView modelAndView(){
        return new ModelAndView();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}