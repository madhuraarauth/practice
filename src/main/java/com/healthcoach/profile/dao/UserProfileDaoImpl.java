package com.healthcoach.profile.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserProfileDaoImpl implements UserProfileDao {

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public boolean login(String username, String password) {
		
		String hql = "FROM UserCreds WHERE username = ?1 and password = ?2";
		int count = entityManager.createQuery(hql).setParameter(1, username)
		              .setParameter(2, password).getResultList().size();
		return count > 0 ? true : false;
	}


}
