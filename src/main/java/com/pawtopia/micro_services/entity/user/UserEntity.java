package com.pawtopia.micro_services.entity.user;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "java_users")
@DynamicInsert
@DynamicUpdate
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "varchar(255) not null comment 'username'")
  private String name;

  @Column(columnDefinition = "varchar(255) not null comment 'email'", unique = true)
  private String email;

  @Column(columnDefinition = "varchar(64) not null comment 'password'")
  private String password;

}
