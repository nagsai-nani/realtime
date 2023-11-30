package com.it.realtime.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.it.realtime.dao.UserDao;
import com.it.realtime.models.User;
@Repository
public class UserDaoImpl implements UserDao {
@Autowired MongoTemplate temp;
	@Override
	public User save(User bean) {
		return	temp.save(bean);
		 
	}

}
