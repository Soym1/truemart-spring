package com.truemart.truemartspring.Controller;

import com.truemart.truemartspring.DTO.userDTO;

import com.truemart.truemartspring.Entity.roleEntity;
import com.truemart.truemartspring.Entity.userEntity;
import com.truemart.truemartspring.Repository.RoleRepository;
import com.truemart.truemartspring.Service.Impl.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UserService userService;


    @GetMapping("/user/{id}")
    public userDTO getUser(@PathVariable Long id){
        Optional<userEntity> userEntity = userService.findOneByID(id);
        Optional<userDTO> userDTO = userEntity.map(userDTO::new);
        return userDTO.get();
    }

    @PostMapping("/user")
    public String createNewUser(@RequestBody userDTO user){
        return userService.updateUser(user);
    }

}
