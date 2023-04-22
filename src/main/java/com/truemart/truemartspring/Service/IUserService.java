package com.truemart.truemartspring.Service;

import com.truemart.truemartspring.DTO.userDTO;
import com.truemart.truemartspring.Entity.userEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IUserService {
    Optional<userEntity> findOneByID(Long id);

    String updateUser(userDTO user);

    Optional<userEntity> getUserByUsernameOrEmail(String username);
}
