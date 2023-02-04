package com.example.demo.domain.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.global.protos.user.UserCreateReq;
import com.example.demo.global.protos.user.UserCreateRes;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping
	public UserCreateRes create(@RequestBody UserCreateReq req) {
		return userService.create(req);
	}
}
