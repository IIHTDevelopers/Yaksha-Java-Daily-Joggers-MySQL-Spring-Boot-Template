package com.dailyjoggers.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dailyjoggers.dto.UserDTO;
import com.dailyjoggers.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Page<UserDTO> getAllUsers(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserById(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUserById(Long userId, UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public void deleteUserById(Long userId) {
		// write your logic here
	}
}
