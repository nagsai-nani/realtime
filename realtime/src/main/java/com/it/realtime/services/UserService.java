package com.it.realtime.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.realtime.dao.UserDao;
import com.it.realtime.models.User;

@Service
public class UserService {
@Autowired UserDao dao;

	public User save(User bean) {
		
		return dao.save(bean);
	}

}
