package com.msita.controller;

import com.msita.entity.User;
import com.msita.form.UserForm;
import com.msita.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(final Model model) {
		model.addAttribute("userForm", new UserForm());
		return "add_user";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userForm") final UserForm userForm) {
		final User user = new User();
		user.setId(userForm.getId());
		user.setPassword(userForm.getPassword());
		user.setFullName(userForm.getFullName());
		user.setPhoto(userForm.getPhoto());
		user.setEmail(userForm.getEmail());

		userService.addUser(user);

		return "redirect:/getAllUsers";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String deleteUser() {
		return "delete_user";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUser(@RequestParam("userId") final String userId) {
		userService.deleteUser(userId);
		return "redirect:/getAllUsers";
	}

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public String getAllUsers(final Model model) {
		List<User> users = userService.getAllUsers();
		model.addAttribute("users", users);
		return "show_all_users";
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public String getUser() {
		return "get_user";
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public String getUser(final Model model, @RequestParam("userId") final String userId) {
		final User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "show_user";
	}
}
