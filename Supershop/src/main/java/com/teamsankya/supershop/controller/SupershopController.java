package com.teamsankya.supershop.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamsankya.supershop.dto.SupershopBean;
import com.teamsankya.supershop.service.SupershopService;
import com.teamsankya.supershop.service.SupershopServiceImpl;

/**
 * This is a Controller class to interact with view and model
 * 
 * {@link SupershopController} Indicates that a particular class serves the role of a
 * controller. {@link RequestMapping} This specify what HTTP Request is handled
 * by the controller and by its method. {@link Autowired} This is used for
 * automatic dependency injection. {@link Qualifier} This is used to avoid
 * conflicts in bean mapping and we need to provide the bean name that will be
 * used for autowiring.
 * 
 * @author Naveen
 */

@Controller
public class SupershopController {
	
	@Autowired
	@Qualifier("service")
	private SupershopService supershopService;
	
	final static Logger LOGGER = Logger.getLogger(SupershopController.class);
	
	@RequestMapping(path= "catName", method = RequestMethod.GET )
	public List<SupershopBean> getId(String catName) {
		LOGGER.info("Inside controller");
		LOGGER.info(catName);
		SupershopServiceImpl supershopService = new SupershopServiceImpl();
		List<SupershopBean> beans = supershopService.getId(catName);
		
		return beans;
	}


}
