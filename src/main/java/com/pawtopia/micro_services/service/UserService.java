package com.pawtopia.micro_services.service;

import java.util.List;

import com.pawtopia.micro_services.entity.user.UserEntity;

public interface UserService {
  UserEntity createUser(UserEntity userEntity);

  List<UserEntity> getAllUsers();
}
