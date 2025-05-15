package com.pawtopia.micro_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.pawtopia.micro_services.entity.user.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
  UserEntity findByName(String name);

  UserEntity findByEmailAndName(String email, String name);

  @Query("SELECT u FROM UserEntity u WHERE u.email = :email")
  UserEntity findByEmail(@Param("email") String email);

  @Modifying
  @Query("UPDATE UserEntity u SET u.password = :password WHERE u.email = :email")
  @Transactional
  void updatePassword(@Param("email") String email, @Param("password") String password);
}
