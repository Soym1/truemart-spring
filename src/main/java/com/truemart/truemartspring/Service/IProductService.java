package com.truemart.truemartspring.Service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.truemart.truemartspring.DTO.productDTO;
import org.springframework.ui.Model;


import java.util.List;

public interface IProductService {
    productDTO getProductByID(Long id);

    List<productDTO> getAllProducts();

    List<productDTO> getProductsByCategoryAndPos(String category, String pos);

    String addNewProduct(ObjectNode productDTO);

    List<productDTO> getListProduct(List<Object[]> products);
}
