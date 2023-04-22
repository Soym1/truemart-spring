package com.truemart.truemartspring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @GetMapping("/login")

    public Object loginPage(@RequestParam(value = "authen", required = false) String paramValue){
        Map<String , Object> modelMap = new HashMap<>();
//        new ApiExceptionHandler().handleRequestException("hello");
        System.out.println("chay vao login");
        return new ModelAndView("login",modelMap);
    }

    @GetMapping("/login?error")
    public ModelAndView loginPageError(@RequestParam(value = "authen", required = false) String paramValue){
        Map<String , Object> modelMap = new HashMap<>();
        System.out.println("chay vao login");
        return new ModelAndView("login",modelMap);
    }
}
