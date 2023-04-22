package com.truemart.truemartspring.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.truemart.truemartspring.DTO.productDTO;
import com.truemart.truemartspring.DTO.shopDTO;

import com.truemart.truemartspring.Service.Impl.ShopService;
import org.hibernate.annotations.Parameter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShopController {
    @Autowired
    ShopService shopService;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/shop")
    public ModelAndView getAllProducts(@RequestParam(value = "authen", required = false) String paramValue){
        Map<String , Object> modelMap = new HashMap<>();
        paramValue = "true";
        return new ModelAndView("shop",modelMap);
    }
    @GetMapping("/get-shop/{id}")
    public shopDTO getShop(@PathVariable Long id){
        return shopService.getShop(id);
    }
    @PostMapping("/new-shop")
    public ObjectNode  createNewShop(@RequestBody ObjectNode user) throws JsonProcessingException {
        Long userID = user.get("user").asLong();
        user.remove("user");
        shopDTO shopDTO = objectMapper.readValue(user.toString(), shopDTO.class);
        shopService.updateShop(userID,shopDTO);
        return user;
    }
}
