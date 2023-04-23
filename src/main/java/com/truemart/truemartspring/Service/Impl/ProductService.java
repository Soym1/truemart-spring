package com.truemart.truemartspring.Service.Impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


import com.truemart.truemartspring.DTO.imageDTO;
import com.truemart.truemartspring.DTO.productDTO;
import com.truemart.truemartspring.DTO.productDetailDTO;
import com.truemart.truemartspring.Entity.imageProductEntity;
import com.truemart.truemartspring.Entity.productDetailEntity;
import com.truemart.truemartspring.Entity.productEntity;
import com.truemart.truemartspring.Entity.reviewEntity;
import com.truemart.truemartspring.Repository.*;
import com.truemart.truemartspring.Service.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService implements IProductService {
    @Autowired
    ImageRepository imageRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    ShopRepository shopRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductDetailRepository productDetailRepository;

    List<productDTO> productDTOList = new ArrayList<>();
    List<Object[]> products = new ArrayList<>();
    Pageable pageable;

    @Override
    public productDTO getProductByID(Long id) {
        Optional<productEntity> productEntityOptional = productRepository.findById(id);
        if (productEntityOptional.isPresent()){
            productEntity productEntity = productEntityOptional.get();
            productDTO productDTO = modelMapper.map(productEntity, productDTO.class);
            return productDTO;
        }
        throw new UsernameNotFoundException("Khong tim thay san pham");
    }

    @Override
    public List<productDTO> getAllProducts() {
        List<productEntity> productEntityList = productRepository.findAll();
//        List<productDTO> productDTOList = modelMapper.map(productEntityList, new TypeToken<List<productDTO>>(){}.getType());
        List<productDTO> productDTOList = productEntityList.stream().map(productEntity -> modelMapper.map(productEntity, productDTO.class))
                .toList();
        return productDTOList;
    }

    @Override
    public List<productDTO> getProductsByCategoryAndPos(String category, String pos) {
        category = category == null ? categoryRepository.findById(1).get().getCategory() : category;
        try {
            pageable = PageRequest.of(0, 5);
            switch (pos) {
                case "new":
                    products = productRepository.getproductEntitiesByCategoryAndNew(category, pageable);
                    break;
                case "top-selling":
                    products = productRepository.getproductEntitiesByCategoryAndTopSelling(category, pageable);
                    break;
                case "suggestion":
                    products = productRepository.getproductEntitiesByCategoryAndSuggestion(category, pageable);
                    break;
            }
            return getListProduct(products);
        } catch (Exception exp) {
            return null;
        }
    }

    @Override
    public String addNewProduct(ObjectNode product) {
        try {
            JsonNode images = product.get("images");
            JsonNode productDetails = product.get("productDetail");
            product.remove("images");
            product.remove("productDetail");
            productDTO productDTO = objectMapper.readValue(product.toString(), productDTO.class);
            productEntity productEntity = modelMapper.map(productDTO, productEntity.class);
            productEntity.setShopID(shopRepository.findById(productDTO.getShopID()).get());
            productEntity.setCategory(categoryRepository.findById(productDTO.getCategoryID()).get());
            productEntity = productRepository.save(productEntity);
            for (JsonNode image : images) {
                imageDTO imageDTO = objectMapper.readValue(image.toString(), imageDTO.class);
                imageProductEntity imageProductEntity = modelMapper.map(imageDTO, imageProductEntity.class);
                imageProductEntity.setProduct(productEntity);
                imageRepository.save(imageProductEntity);
            }
            for (JsonNode detail : productDetails) {
                productDetailDTO productDetailDTO = objectMapper.readValue(detail.toString(), productDetailDTO.class);
                productDetailEntity productDetailEntity = modelMapper.map(productDetailDTO, productDetailEntity.class);
                productDetailEntity.setProduct(productEntity);
                productDetailRepository.save(productDetailEntity);
            }
            return "Add new product success";
        } catch (Exception except) {
            return "Error add new product";
        }
    }
    @Override
    public List<productDTO> getListProduct(List<Object[]> products) {
        for (Object[] product : products) {
            productDTO productDTO = new productDTO();
            List<imageDTO> list = new ArrayList<>();
            pageable = PageRequest.of(0, 1);
            List<imageProductEntity> imageProductEntity = imageRepository.findOneByProductID((Long) product[0], pageable);
            if (!imageProductEntity.isEmpty()) {
                list.add(modelMapper.map(imageProductEntity.get(0), imageDTO.class));
            }
            productDTO.setProductID((Long) product[0]);
            productDTO.setProductName((String) product[1]);
            productDTO.setProductBeginPrice((Double) product[2]);
            System.out.println(productDTO.getProductBeginPrice());
            productDTO.setProductDiscountPrice((Double) product[3]);
            productDTO.setImages(list);
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }
}
