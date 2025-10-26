package com.dairy.farm.user.service;

import java.util.List;

import com.dairy.farm.user.dto.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDto);
	
	UserDto updateUser(UserDto userDto, Long id);
	
	UserDto getUserById(Long id);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Long id);

}
