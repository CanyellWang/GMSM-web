package com.neo.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neo.model.User;
import com.neo.service.UserService;

public class UserTest {

	private UserService userService;

	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:config/spring.xml", "classpath:config/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userServiceImpl");
	}
	
//	@Test
    public void addUser(){
        User user = new User();
        user.setNickname("你好");
        user.setState(2);
        System.out.println(userService.insertUser(user));
    }
	
	@Test
	
	public void findAll() {
		User user = new User();
		List<User> res = userService.findAll(user);
		for (User u : res) {
			System.out.println(u.getId());
		}
	}
}
