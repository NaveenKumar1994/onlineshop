package com.teamsankya.supershop.dao;

import java.util.List;

import com.teamsankya.supershop.dto.SupershopBean;
/**
 * We perform Database connectivity, configuration and interaction 
 * and giving response back to servce
 * @author Naveen
 */
public interface SupershopDAO {
	/**
	 * 
	 * @param id
	 * @return the Object of LotBean
	 */
	public List<SupershopBean> getId(String catName);

}
