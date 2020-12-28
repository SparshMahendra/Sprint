package com.facebookboot.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.entity.FacebookUser;

public class FacebookDTO implements FacebookDTOInterface {

	
	@Autowired
	private FacebookDAOInterface fd;
	
	
	public FacebookUser createProfileDTO(FacebookUser fu) {
		return fd.save(fu);
	}
	
	
	public FacebookUser deleteProfileDTO(FacebookUser fu) {
		return fd.delete(fu);
	}
	
	
	public Optional<FacebookUser> viewProfileDTO(Long id) {
		return fd.findById(id);
	}
	
	public List<FacebookUser> viewAllProfileDTO() {
		return fd.findAll();
	}
	
	public boolean searchProfileByIdDTO(Long id) {
		boolean i = fd.existsById(id);
		return i;
	}
	
	public boolean searchProfileByNameDTO(String name) {
		boolean i = fd.searchProfileByName(name);
		return i;
	}

}
