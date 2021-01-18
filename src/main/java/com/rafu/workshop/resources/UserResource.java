package com.rafu.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafu.workshop.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User> >findAll(){
		User rafu = new User("1","Rafu","rafu@gmail.com");
		User renan = new User("2","Renan","renan@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(rafu,renan));
		return ResponseEntity.ok().body(list);
	}
}
