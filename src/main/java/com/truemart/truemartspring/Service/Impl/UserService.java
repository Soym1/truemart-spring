package com.truemart.truemartspring.Service.Impl;

import com.truemart.truemartspring.DTO.userDTO;
import com.truemart.truemartspring.Entity.roleEntity;
import com.truemart.truemartspring.Entity.userEntity;
import com.truemart.truemartspring.Repository.RoleRepository;
import com.truemart.truemartspring.Repository.UserRepository;
import com.truemart.truemartspring.Service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Override
    public Optional<userEntity> findOneByID(Long id){
        return userRepository.findById(id);
    }
    @Override
    public String updateUser(userDTO user){
        try {

            List<roleEntity> roles = new ArrayList<>();
            user.getRole().forEach(role ->{
                roles.add(roleRepository.findById((Integer) role).get());
            });
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userEntity userEntity = modelMapper.map(user, userEntity.class);
            userEntity.setRoles(roles);
            userRepository.save(userEntity);
            return "Success";
        } catch (Exception exp){
            return "Error";
        }
    };
    @Override
    public Optional<userEntity> getUserByUsernameOrEmail(String username){
        return userRepository.findUserByUsername(username) != null ? userRepository.findUserByUsername(username) : userRepository.findUserByEmail(username);
    }


}
