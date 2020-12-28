package com.facebookboot.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.facebookboot.entity.FacebookUser;
import com.facebookboot.service.FacebookServiceInterface;

@RestController
//@CrossOrigin(origins = {"http://localhost:3000"}, methods = RequestMethod.GET, )
public class FacebookController {

	@Autowired
	private FacebookServiceInterface fs;
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Profile with this id not present")
    @ExceptionHandler({Exception.class})
    public void handleException() {
      
    }
	
	
	@PostMapping("createprofilefacebook")
	public String createProfile(@RequestBody FacebookUser fu) {
		String str = "Registration Fail";
		int i = fs.createProfileService(fu);
		if(i>0) {
		str = "Registration Success";
		}
		return str;
	}
	
//	@DeleteMapping("deleteprofilefacebook")
//	public String deleteProfile(@PathParam("id") String id, FacebookUser fu) {
//		String str = "Profile Not Deleted";
//		int i = fs.deleteProfileService(fu);
//		if(i>0) {
//		str = "Profile Deleted";
//		}
//		return str;
//	}
//	
//	@GetMapping("viewprofilefacebook")
//	public Optional<FacebookUser> viewProfile(@PathParam("id") String id, FacebookUser fu) {
//		Optional<FacebookUser> ob = fs.viewProfileService(id);
//		return ob;
//	}
//	
//	
//	@PostMapping("searchprofilebyidfacebook")
//	public String searchProfile(@PathParam("id") String id){
//		String str = "Profile Not Found";
//		boolean t = fs.searchProfileByIdService(id);
//		if(t != false) {
//			str = "Profile Found";
//		}
//		return str;
//	}
//	
//	@PostMapping("searchprofilebynamefacebook")
//	public String searchProfile(@PathParam("name") String name){
//		String str = "Profile Not Found";
//		boolean t = fs.searchProfileByNameService(name);
//		if(t != false) {
//			str = "Profile Found";
//		}
//		return str;
//	}
//	
//	@PutMapping("editprofilefacebook")
//	public String editProfile(@RequestBody FacebookUser fu, @PathParam("id") String id) {
//		String str = "Profile Not Edited";
//		int i = fs.editProfileService(fu);
//		if(i>0) {
//			str = "Profile Edited";
//		}
//		
//		return str;
//		
//	}
//	
//	@GetMapping("viewAllprofilefacebook")
//	public List<FacebookUser> viewallProfile() {
//		List<FacebookUser> ll = new ArrayList<FacebookUser>();
//		ll = fs.viewAllProfileService();
//		return ll;
//	}
//	
//
//	

}
