package com.facebookboot.dao;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.facebookboot.entity.FacebookUser;

@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser, Long>{
//
//	@Query("from com.facebookboot.entity.FacebookUser fu where fu.username=:name")
//	FacebookUser searchProfileByName(String name);
//	
//	@Transactional
//	@Query("update FacebookUser c set c.username=:name, c.email=:em, c.password=:pass where c.uid=:id")
//	int updateProfile(String name, String em, String pass, int id);
	
	
}
