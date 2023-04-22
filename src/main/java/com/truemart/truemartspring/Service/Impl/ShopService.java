package com.truemart.truemartspring.Service.Impl;

import com.truemart.truemartspring.DTO.shopDTO;
import com.truemart.truemartspring.Entity.shopEntity;
import com.truemart.truemartspring.Repository.ShopRepository;
import com.truemart.truemartspring.Repository.UserRepository;
import com.truemart.truemartspring.Service.IShopService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService implements IShopService {
    @Autowired
    ShopRepository shopRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public shopDTO getShop(Long id){
        shopEntity shopEntity = shopRepository.findById(id).get();
        shopDTO shopDTO = modelMapper.map(shopEntity, shopDTO.class);
        return shopDTO;
    }
    @Override
    public String updateShop(Long id, shopDTO shop){
        try {
            shopEntity shopEntity = modelMapper.map(shop, shopEntity.class);
            shopEntity.setUser(userRepository.findById(id).get());
            shopRepository.save(shopEntity);
            return "Success";
        } catch (Exception exp){
            return "Error";
        }
    };


}
