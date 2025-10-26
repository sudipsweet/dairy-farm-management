package com.dairy.farm.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy.farm.user.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByUserName(String userName);
	
	boolean existsByEmailAddress(String email);

}
