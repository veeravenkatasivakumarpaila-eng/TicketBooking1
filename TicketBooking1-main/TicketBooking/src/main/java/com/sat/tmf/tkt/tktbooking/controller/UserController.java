
package com.sat.tmf.tkt.tktbooking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sat.tmf.tkt.tktbooking.dto.CreateUserDTO;
import com.sat.tmf.tkt.tktbooking.entity.User;
import com.sat.tmf.tkt.tktbooking.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/test", method = RequestMethod.GET)
//	@GetMapping
//	@PostMapping
	public String testMethod(@RequestParam("uname") String userName) {
		System.out.println("This is a testMethod() @ UserController");
		System.out.println("User Name:"+userName);
		return null;
	}
	
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public String testPostMethod(@RequestParam("uname") String userName) {
		System.out.println("This is a testMethod() @ UserController");
		System.out.println("User Name:"+userName);
		return null;
	}
	
	@RequestMapping(value="/addNew", method= RequestMethod.POST)
	public String registerNewUser( @RequestBody CreateUserDTO user) {
		User userResp = userService.registerNewUser(user);
		System.out.println(userResp.getId());
		return null;
	}
	
	@RequestMapping(value="/allUsers", method=RequestMethod.GET)
	public List<User> getAllUsers() {
		System.out.println(userService.getAllUsers());
		return userService.getAllUsers();
	}
	
	@GetMapping("/searchUserByName")
	public List<User> getUserByFirstName(@RequestParam("fName") String firstName){
		System.out.println(userService.getUserByFirstName(firstName).size());
		return userService.getUserByFirstName(firstName);
	}
	
	@GetMapping("/search")
    public String searchUsers(@RequestParam("name") String name, Model model) {

        List<User> users = userService.searchUsers(name);
        model.addAttribute("users", users);
        model.addAttribute("searchName", name);

        return "search_user";
    }
}

