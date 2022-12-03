package com.sirius.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirius.workshopmongo.domain.Post;
import com.sirius.workshopmongo.domain.User;
import com.sirius.workshopmongo.dto.UserDTO;
import com.sirius.workshopmongo.repository.PostRepository;
import com.sirius.workshopmongo.repository.UserRepository;
import com.sirius.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Post post = repo.findById(id).orElse(null);
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return post;
	}
}
