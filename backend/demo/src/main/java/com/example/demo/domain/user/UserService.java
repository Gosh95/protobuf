package com.example.demo.domain.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.global.protos.user.UserCreateReq;
import com.example.demo.global.protos.user.UserCreateRes;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	@Transactional
	public UserCreateRes create(UserCreateReq req) {
		var user = userRepository.save(UserMapper.toUser(req));
		return UserMapper.toUserCreateRes(user);
	}
}
