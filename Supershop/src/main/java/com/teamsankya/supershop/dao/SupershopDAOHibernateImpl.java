package com.teamsankya.supershop.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamsankya.supershop.controller.SupershopController;
import com.teamsankya.supershop.dto.SupershopBean;


/**
 * Here we are implementing SupershopDAO interface. see org.hibernate.SessionFactory
 * {@link Autowired} This is used for automatic dependency injection
 * {@link Override} This is used for implementing abstract methods
 * @author Naveen
 */

public class SupershopDAOHibernateImpl implements SupershopDAO {
	
	public SupershopDAOHibernateImpl() {

	}
	
	/**
	 * SessionFactory is usually created during application start up and kept for
	 * later use.
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	final static Logger LOGGER = Logger.getLogger(SupershopController.class);

	/**
	 * This method interacts with the database and get the bean.
	 */
	@Override
	public List<SupershopBean> getId(String catName) {
		
		
		LOGGER.info("inside NatureBandhuDaoHibernateImpl class");
		LOGGER.info("productName : "+catName); 
		 Session session;
		try {
					
			session = sessionFactory.openSession();
			
//			cr.add(Restrictions.like("catName", catName));

//			superBeans = cr.list();
					
		} catch (HibernateException e) {

			session = sessionFactory.getCurrentSession();
		}
		
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(SupershopBean.class);
		criteria.add(Restrictions.ilike("catName", "%"+catName));
		List<SupershopBean> results=criteria.list();
		transaction.commit();
		return results;
	}
}
