package com.learning.test;

import java.util.ArrayList;
import java.util.List;

import com.learning.test.model.User;
import com.learning.test.service.UserService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		UserService userService = new UserService();
		List<User> userList = new ArrayList<>();
		userService.createUser(new User(), userList);
		userService.createUser(new User(), userList);
		// userService.createUser(new User(), userMap);
		// userService.createUser(new User(), userMap);
		userService.display(1, userList);
		// userService.deleteUser(2,userList);
		userService.updateUser(0, userList);
		userService.displayAll(userList);
	}
}
