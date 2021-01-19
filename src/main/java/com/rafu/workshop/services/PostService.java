package com.rafu.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafu.workshop.domain.Post;
import com.rafu.workshop.domain.User;
import com.rafu.workshop.dto.UserDTO;
import com.rafu.workshop.repository.PostRepository;
import com.rafu.workshop.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;


	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

	}
}
