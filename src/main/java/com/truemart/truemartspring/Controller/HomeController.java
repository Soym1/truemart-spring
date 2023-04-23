package com.truemart.truemartspring.Controller;


import com.fasterxml.jackson.databind.node.ObjectNode;

import com.truemart.truemartspring.DTO.productDTO;
import com.truemart.truemartspring.Service.Impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@RestController
public class HomeController {
    @Autowired
    ProductService productService;
    //  Get data for Homepage
    @GetMapping("/")
    public ModelAndView loadHomePage(Model model){
        Map<String,Object> modelMap = new HashMap<>();
        List<productDTO> list = productService.getProductsByCategoryAndPos(null,"new");
        modelMap.put("newProducts", list);
//        model.addAttribute("newProducts", list);
        return new ModelAndView("index",modelMap);
    }
//    public String getProductsByCategoryAndPos(@RequestParam(value = "category", required = false) String category,
//                                              @RequestParam(value = "pos",required = false) String pos,
//                                              Model model){
//        List<productDTO> productDTOList = new ArrayList<>();
////        model = productService.getProductsByCategoryAndPos(category,pos,model);
//        model.addAttribute("new","hellooooo");
//        System.out.println("Co cahy");
//        return "index";
//    }

//    @GetMapping("/handler-img")
//    public String handerImg(@RequestBody ObjectNode file) throws IOException {
//        System.out.println(file.get("base64").toString().replaceAll("\"",""));
//        String base64String = file.get("base64").toString().replaceAll("\"","");
//        byte[] decodedBytes = Base64.getDecoder().decode(base64String);
//        Path destinationFile = Paths.get("C:\\Users\\Soym\\Desktop\\New folder (2)", "myImage");
//        destinationFile = destinationFile.resolveSibling(destinationFile.getFileName() + ".png");
//        Files.write(destinationFile, decodedBytes);
//        return file.get("base64").toString();
//    }
}
