package com.pawtopia.micro_services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawtopia.micro_services.entity.user.UserEntity;
import com.pawtopia.micro_services.repository.UserRepository;
import com.pawtopia.micro_services.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public UserEntity createUser(UserEntity userEntity) {
    return userRepository.save(userEntity);
  }

  @Override
  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }
}
