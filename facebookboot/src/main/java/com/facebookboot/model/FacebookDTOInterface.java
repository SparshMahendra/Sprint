package com.facebookboot.model;

import java.util.List;
import java.util.Optional;

import com.facebookboot.entity.FacebookUser;

public interface FacebookDTOInterface {

	public FacebookUser createProfileDTO(FacebookUser fu);

//	public Optional<FacebookUser> viewProfileDTO(Long id);
//
//	public int deleteProfileDTO(FacebookUser fu);
//
//	public List<FacebookUser> viewAllProfileDTO();
//
//	public boolean searcgProfileDTO(Long id);
//
//	public boolean searchProfileByNameDTO(String name);
//
//	public boolean searchProfileByIdDTO(Long id);
}
