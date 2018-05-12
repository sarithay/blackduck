package com.infosys.realsocial.repository;

import org.springframework.data.repository.CrudRepository;

import com.infosys.realsocial.model.UserProfile;

public interface RSMongoRepository extends CrudRepository<UserProfile, String>{}