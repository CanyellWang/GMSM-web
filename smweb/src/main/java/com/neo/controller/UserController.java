package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neo.model.User;
import com.neo.service.UserService;
 
@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
    @RequestMapping("index")
    public String index(){
    	User user = new User();
        user.setNickname("你好");
        user.setState(2);
        System.out.println(userService.insertUser(user));
    	System.out.println("======================");
        return "index";
    }
    
    
     
}
