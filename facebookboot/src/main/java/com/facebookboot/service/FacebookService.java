package com.facebookboot.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.entity.FacebookUser;
import com.facebookboot.model.FacebookDTOInterface;

@Service
public abstract class FacebookService implements FacebookServiceInterface {

	@Autowired
	private FacebookDTOInterface dto;
	
	
	public int createProfileService(FacebookUser fu) {
		int i = dto.createProfileDTO(fu);
		return i;
	}
//	
//	
//	public int deleteProfileService(FacebookUser fu) {
//		int i = dto.deleteProfileDTO(fu);
//		return i;
//	}
//	
//	
//	public Optional<FacebookUser> viewProfileService(Long id) {
//		return dto.viewProfileDTO(id);
//	}
//	
//	public List<FacebookUser> viewAllProfileService() {
//		return dto.viewAllProfileDTO();
//	}
//	
//	public boolean searchProfileByIdService(Long id) {
//		return dto.searchProfileByIdDTO(id);
//	}
//	
//	public boolean searchProfileByNameService(String name) {
//		return dto.searchProfileByNameDTO(name);
//	}
//
//
//	@Override
//	public Optional<FacebookUser> viewProfileService(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public boolean searchProfileService(String id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public int editProfileService(FacebookUser fu) {
//		return 
//	}
//
//
//
//
//	
//
//	
//	
}
