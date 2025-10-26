package com.dairy.farm.user.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.farm.user.dto.UserDto;
import com.dairy.farm.user.entites.User;
import com.dairy.farm.user.mapper.UserMapper;
import com.dairy.farm.user.repository.UserRepository;
import com.dairy.farm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = userRepository.save(UserMapper.toUser(userDto));
		return UserMapper.toUserDto(user);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Long id) {
		User user = userRepository.findById(id).get();
		user.setUserName(userDto.getUserName());
		user.setPassword(userDto.getPassword());
		user.setEmailAddress(userDto.getEmailAddress());
		user.setRole(userDto.getRole());
		return UserMapper.toUserDto(userRepository.save(user));
	}

	@Override
	public UserDto getUserById(Long id) {
		User user = userRepository.findById(id).get();
		return UserMapper.toUserDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> userList = userRepository.findAll();
		return userList.stream().map(user -> UserMapper.toUserDto(user)).collect(Collectors.toList());
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

}
