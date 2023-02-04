package com.example.demo.domain.user;

import static lombok.AccessLevel.PRIVATE;

import com.example.demo.domain.user.model.User;
import com.example.demo.global.protos.user.UserCreateReq;
import com.example.demo.global.protos.user.UserCreateRes;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
public class UserMapper {

	public static User toUser(UserCreateReq req) {
		return User.builder()
			.name(req.getName())
			.email(req.getEmail())
			.password(req.getPassword())
			.gender(req.getGender().name())
			.build();
	}

	public static UserCreateRes toUserCreateRes(User user) {
		return UserCreateRes.newBuilder().setId(user.getId()).build();
	}
}
