package com.teamsankya.supershop.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamsankya.supershop.dto.SupershopBean;


/**
 * Here we are implementing SupershopDAO interface. see org.hibernate.SessionFactory
 * {@link Autowired} This is used for automatic dependency injection
 * {@link Override} This is used for implementing abstract methods
 * @author Naveen
 */

public class SupershopDAOHibernateImpl implements SupershopDAO {
	/**
	 * SessionFactory is usually created during application start up and kept for
	 * later use.
	 */
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * This method interacts with the database and get the bean.
	 */
	public List<SupershopBean> getId(String catName) {
		List<SupershopBean> superBeans = null;
		try {
			
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			
			Session session =sf.openSession();
			Criteria cr = session.createCriteria(SupershopBean.class);
			cr.add(Restrictions.ilike("catName", "%"+catName));
			superBeans = cr.list();
			
			
		} catch (HibernateException e) {

		}
		return superBeans;
	}
}
