package com.truemart.truemartspring.Controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;
import com.truemart.truemartspring.DTO.productDTO;
import com.truemart.truemartspring.Entity.productEntity;
import com.truemart.truemartspring.Service.Impl.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product/{id}")
    public productDTO getProductByID(@PathVariable Long id){
        return productService.getProductByID(id);
    }
    @GetMapping("/products")
    public List<productDTO> getAllProducts(){return productService.getAllProducts();}
    @GetMapping("/product")
    public String getProductsByCategoryAndPos(@RequestParam(value = "category", required = false) String category,
                                                        @RequestParam(value = "pos",required = false) String pos,
                                                        Model model){
        List<productDTO> productDTOList = new ArrayList<>();
        productDTOList = productService.getProductsByCategoryAndPos(category,pos);
        model.addAttribute("new","a");
        model.addAttribute("old", "b");
        System.out.println(model.getAttribute("new"));
        return "success";
    }
    @PostMapping("/new-product")
    public String addNewProduct(@RequestBody ObjectNode product){
        return productService.addNewProduct(product);
    }
}
