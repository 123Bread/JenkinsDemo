package zhang.com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "test";
	}
	
	public String method(){
		System.out.println("confilct---conflict");
		System.out.println("ddd");
		System.out.println("conflict");
		return "method";
	}
	
	public String conflict(){
		return "conflict";
	}
}