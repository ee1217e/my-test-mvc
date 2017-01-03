package my.test.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping(value="test.do", method=RequestMethod.GET)
	public String test(){
		return "test";
	}
	
	@RequestMapping(value="testOk.do", method=RequestMethod.POST)
	public String testOk(@RequestParam("subject")String subject,
			HttpServletRequest request){
		String content = request.getParameter("content");
		
		System.out.println(subject);
		System.out.println(content);
		
		return "test";
	}
}
