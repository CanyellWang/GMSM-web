package com.neo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neo.model.User;
import com.neo.service.UserService;

@Controller
@RequestMapping("/json")
public class JsonController {

	@Autowired
	private UserService userService;
	
    @RequestMapping("list")
    public @ResponseBody List<User> getResult(){
 
    	List<User> res = userService.findAll(new User());
        return res;
    }
}
