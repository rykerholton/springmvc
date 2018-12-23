package omg.springmvc.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}
}
