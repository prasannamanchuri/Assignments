package com.capgemini.springmvc.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.capgemini.springmvc.dao.UserDao;
import com.capgemini.springmvc.entity.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public String save(User user) {
		try {
			if(getUsername(user.getUsername())==null) {
				mongoTemplate.save(user);
			}
			else
				return "User Exists already";
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failure";
	}

	@Override
	public User getUsername(String username) {
		Query query = new Query(Criteria.where("username").is(username));
		User user = mongoTemplate.findOne(query, User.class);
		return user;
	}

}
