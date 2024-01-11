package com.dailyjoggers.service.impl;

import java.util.List;

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
	public List<UserDTO> getAllUsers() {
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
	public boolean deleteUserById(Long userId) {
		// write your logic here
		return false;
	}
}
