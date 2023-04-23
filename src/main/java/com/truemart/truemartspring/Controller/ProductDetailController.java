package com.truemart.truemartspring.Controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.truemart.truemartspring.DTO.productDTO;
import com.truemart.truemartspring.DTO.reviewDTO;
import com.truemart.truemartspring.Service.Impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductDetailController {
    @Autowired
    ProductService productService;

    @GetMapping("/product-detail/{id}")
    public ModelAndView getProductByID(@PathVariable Long id){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("productDetail", productService.getProductByID(id));
        return new ModelAndView("productdetail",modelMap);
    }
//    @GetMapping("/product-detail/{id}")
//    public productDTO getProductByID(@PathVariable Long id){
//        Map<String,Object> modelMap = new HashMap<>();
////        modelMap.put("productDetail", productService.getProductByID(id));
//        return productService.getProductByID(id);
//    }

    @PostMapping("/review")
    public String addNewReview(){
        System.out.println("Co chay vao");
        return "Success";
    }

}
