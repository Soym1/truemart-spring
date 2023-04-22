package com.truemart.truemartspring.Service;

import com.truemart.truemartspring.DTO.shopDTO;
import com.truemart.truemartspring.DTO.userDTO;
import com.truemart.truemartspring.Entity.userEntity;
import org.springframework.stereotype.Service;

public interface IShopService {
    shopDTO getShop(Long id);

    String updateShop(Long id, shopDTO shop);
}
