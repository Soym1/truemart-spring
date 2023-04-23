package com.truemart.truemartspring.Service.Impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.truemart.truemartspring.DTO.imageDTO;
import com.truemart.truemartspring.DTO.productDTO;
import com.truemart.truemartspring.DTO.productDetailDTO;
import com.truemart.truemartspring.DTO.reviewDTO;
import com.truemart.truemartspring.Entity.*;
import com.truemart.truemartspring.Repository.*;
import com.truemart.truemartspring.Service.IProductDetailService;
import com.truemart.truemartspring.Service.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductDetailService implements IProductDetailService {
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
    @Autowired
    UserRepository userRepository;
    @Autowired
    ReviewRepository reviewRepository;


    @Override
    public reviewDTO  addNewProductReview(reviewDTO reviewDTO) {
        Optional<userEntity> userEntityOptional = userRepository.findUserByUsername(reviewDTO.getUsername());
        if (userEntityOptional.isPresent()) {
            userEntity userEntity = userEntityOptional.get();
            reviewEntity reviewEntity = modelMapper.map(reviewDTO, reviewEntity.class);
            reviewEntity.setUser(userEntity);
            reviewRepository.save(reviewEntity);
            reviewDTO  = modelMapper.map(reviewEntity, reviewDTO.class);
            return reviewDTO;
        }
        throw new UsernameNotFoundException("Khong tim thay san pham");
    }
}
