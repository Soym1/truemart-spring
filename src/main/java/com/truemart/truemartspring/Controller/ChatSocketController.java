//package com.truemart.truemartspring.Controller;
//
//
//import com.truemart.truemartspring.Model.CustomUserDetail;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.socket.CloseStatus;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ChatSocketController extends TextWebSocketHandler {
//    private final Map<String,WebSocketSession> webSocketSessionMap = new HashMap<>();
//
//    @Override
//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//        String username = session.getUri().toString().split("=")[1];
//        webSocketSessionMap.put(username,session);
//    }
//
//    @Override
//    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        System.out.println(message.toString());
//    }
//
//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
//        System.out.println("Close");
//    }
//}
