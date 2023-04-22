//package com.truemart.truemartspring.Config;
//
//import com.truemart.truemartspring.Controller.ChatSocketController;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//@Configuration
//@EnableWebSocket
//public class ChatSocketConfig implements WebSocketConfigurer {
//    private final static String CHAT_ENDPOINT = "/chat";
//    @Bean
//    public WebSocketHandler webSocketHandler(){
//        return new ChatSocketController();
//    }
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(webSocketHandler(),CHAT_ENDPOINT).setAllowedOrigins("*");
//    }
//}
