package com.abhimvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Handler {
@RequestMapping(value="/first",method=RequestMethod.GET)
public ModelAndView name() {
	String msg="WELCOME MVC";
	return new ModelAndView("first", "message",msg);
}
}
