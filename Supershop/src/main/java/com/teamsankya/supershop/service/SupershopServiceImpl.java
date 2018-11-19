package com.teamsankya.supershop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.teamsankya.supershop.dao.SupershopDAO;
import com.teamsankya.supershop.dao.SupershopDAOHibernateImpl;
import com.teamsankya.supershop.dto.SupershopBean;
/**
 * Here we are implementing SupershopDAO interface. see org.hibernate.SessionFactory
 * {@link Autowired} This is used for automatic dependency injection
 * {@link Qualifier} This is used to avoid conflicts in bean mapping and we need
 * to provide the bean name that will be used for autowiring
 * 
 * @author Naveen
 */

public class SupershopServiceImpl implements SupershopService {
	/**
	 * This is reference variable of SupershopDAO interface.
	 */
	@Autowired
	@Qualifier("dao")
    SupershopDAO supershopDAO;
    
    
    /**
	 * This method interacts with the database and get the catName.
	 */
	@Override
	public List<SupershopBean> getId(String catName) {
		SupershopDAOHibernateImpl supershopDAO = new SupershopDAOHibernateImpl();
		return supershopDAO.getId(catName);
	}

}

