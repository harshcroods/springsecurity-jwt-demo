package com.croods.springsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.croods.springsecurity.entity.ERole;
import com.croods.springsecurity.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByName(ERole name);
}
