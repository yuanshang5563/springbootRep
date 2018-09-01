package org.ys.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ys.model.CoreUser;
import org.ys.service.CoreUserService;

@RestController
@RequestMapping("/UserController.do")
public class UserController {
	@Autowired
	private CoreUserService coreUserService;
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		CoreUser user = new CoreUser();
		user.setUserName("test");
		user.setBirtyday(new Date());
		user.setPassword("123456");
		coreUserService.save(user);
		return "hello";
		//return new ModelAndView("user_list");
	}
}
