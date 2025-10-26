package com.dairy.farm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.user.dto.UserDto;
import com.dairy.farm.user.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Create User API
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody @Valid UserDto userDto){
		UserDto createUser = userService.createUser(userDto);
		return new ResponseEntity<UserDto>(createUser, HttpStatus.CREATED);
	}
	// Update User API
	@PostMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@RequestBody @Valid UserDto userDto, @PathVariable("id") long id){
		UserDto updateUser = userService.updateUser(userDto, id);
		return new ResponseEntity<UserDto>(updateUser, HttpStatus.OK);
	}
	//Get User By Id API
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") long id){
		UserDto userDto = userService.getUserById(id);
		return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
		
	}
	//Get All User
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser(){
		List<UserDto> allUsers = userService.getAllUsers();
		return new ResponseEntity<List<UserDto>>(allUsers, HttpStatus.OK);
	}
	//Delete User By Id
	@DeleteMapping("/{id}")
	public ResponseEntity<UserDto> deleteUserById(@PathVariable("id") long id){
		userService.deleteUser(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
