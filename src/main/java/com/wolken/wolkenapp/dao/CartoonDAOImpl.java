package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateUtil;
import com.wolken.wolkenapp.dto.CartoonDTO;


public class CartoonDAOImpl implements CartoonDAO {
	
	CartoonDTO dto = new CartoonDTO();
	

	@Override
	public void createCartoon(CartoonDTO cartoonDTO) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cartoonDTO);
		transaction.commit();
		session.close();
		//factory.close();
		
	}

	@Override
	public void updateById(Integer cartoonId,String cartoonName) {
		// TODO Auto-generated method stub
		/*Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CartoonDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		CartoonDTO dto2 =session.get(CartoonDTO.class, cartoonId);
		dto2.setCartoonName(cartoonName);
		Transaction transaction = session.beginTransaction();
		session.update(dto2);
		//session.update(cartoonId);
		transaction.commit();
		session.close();
		//factory.close();*/
		//return dtos;
		
		/* Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.createQuery("update  CartoonDTO car set  car.cartoonName =' "+ cartoonName+" ' where car.cartoonId="+cartoonId+" "); 
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();*/
		
		
		  //named parameter =:uniquename
		/*  Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.createQuery("update CartoonDTO car set car.cartoonName=: cn where car.cartoonId=: ci "); 
		  query.setParameter("ci", cartoonId);
		  query.setParameter("cn", cartoonName);
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();*/
		
		//namedquery
		 Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.getNamedQuery("update"); 
		  query.setParameter("ci", cartoonId);
		  query.setParameter("cn", cartoonName);
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();
	
		
	}

	@Override
	public void delete(Integer cartoonId1) {
		// TODO Auto-generated method stub
		/*Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CartoonDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		CartoonDTO dto1 =session.get(CartoonDTO.class, cartoonId1);
		Transaction transaction = session.beginTransaction();
		session.delete(dto1);
		transaction.commit();
		session.close();
		//factory.close();*/
		
		 Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.createQuery("delete from CartoonDTO car where car.cartoonId= "+cartoonId1+" "); 
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();
		
	/*	Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.getNamedQuery("delete"); 
		  Transaction transaction = session.beginTransaction();
		  query.executeUpdate(); 
		  transaction.commit();
		  session.close();*/
		
		
	
	}

	@Override
	public  List<CartoonDTO> getAll() {
		// TODO Auto-generated method stub  -- to get multiple data 
		// hibernate query language
		/*  Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.createQuery("From CartoonDTO"); 
		  List<CartoonDTO> dtos = query.list(); 
		  dtos.forEach(System.out::print); 
		  session.close();
		return dtos;
		 */
		
		 Session session = HibernateUtil.getFactory().openSession();
		  Query query = session.getNamedQuery("selectAll"); 
		  List<CartoonDTO> dtos = query.list(); 
		  dtos.forEach(System.out::print); 
		  session.close();
		return dtos;
		
		// to get single data
		/*Session session = HibernateUtil.getFactory().openSession();
		Query query = session.createQuery("select ca from CartoonDTO ca where cartoonId=5");
		CartoonDTO dtos = (CartoonDTO)query.uniqueResult();
		System.out.println(dtos);
		*/
		
		
		
	}

}
