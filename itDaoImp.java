package com.motivity.dao;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motivity.entities.ITcompany;
import java.util.List;

@Repository
public class ItDaoImpl implements ItDao {
	@Autowired
	   private SessionFactory sessionFactory;

	   public void add(ITcompany itcompany) {
	       sessionFactory.getCurrentSession().save(itcompany);
	 }
	   public void delete(ITcompany itcompany) {
	       sessionFactory.getCurrentSession().delete(itcompany);
	 }
	   public void update(ITcompany itcompany) {
	       sessionFactory.getCurrentSession().update(itcompany);
	 }
	   @SuppressWarnings("unchecked")
		public List<ITcompany> selection(){
			//Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Mobile.class);
			List<ITcompany> listUser = (List<ITcompany>) sessionFactory.getCurrentSession()
	                .createCriteria(ITcompany.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	        return listUser; //criteria.list();
		}


}
