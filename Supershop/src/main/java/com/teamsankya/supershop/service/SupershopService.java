package com.teamsankya.supershop.service;

import java.util.List;

import com.teamsankya.supershop.dto.SupershopBean;

/**
 * In this SupershopService, we can write some  business logics to 
 * communicate with DAO and give the response to controller
 *	@author Naveen
 */
public interface SupershopService {
	

public List<SupershopBean> getId(String catName);

}
