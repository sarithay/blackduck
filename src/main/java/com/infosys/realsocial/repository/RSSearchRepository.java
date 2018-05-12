package com.infosys.realsocial.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.infosys.realsocial.model.UserProfile;

@Repository
public class RSSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<UserProfile> searchCars(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("description").regex(text, "i"), 
									Criteria.where("make").regex(text, "i"), 
									Criteria.where("model").regex(text, "i"))
						), UserProfile.class);
	}
	
}
