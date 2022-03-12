package org.example.controller;

import org.example.MM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class HomeController {

	private final Logger LOGGER = LoggerFactory.getLogger(HomeController.class.getName());

	
	@RequestMapping(value="/hello")
	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
		ModelAndView ret = new ModelAndView("home");
		// Adds an objet to be used in home.jsp
		ret.addObject("name", name);
		LOGGER.debug("@@");
		LOGGER.info("!!@@");
		MM a = null;
		try{
			a = new MM();
		}catch (Exception e){

		}

		System.out.println(a);


		return ret;
	}
}
