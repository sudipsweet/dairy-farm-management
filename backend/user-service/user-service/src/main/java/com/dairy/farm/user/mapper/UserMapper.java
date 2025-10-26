package com.dairy.farm.user.mapper;

import com.dairy.farm.user.dto.UserDto;
import com.dairy.farm.user.entites.User;

public class UserMapper {

	public static User toUser(UserDto userDto) {
		return new User(userDto.getUserId(), userDto.getUserName(), userDto.getPassword(), userDto.getEmailAddress(),
				userDto.getRole());
	}

	public static UserDto toUserDto(User user) {
		return new UserDto(user.getUserId(), user.getUserName(), user.getPassword(), user.getEmailAddress(),
				user.getRole());

	}

}
