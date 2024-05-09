package com.lucioribeiro.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucioribeiro.workshopmongo.domain.Post;
import com.lucioribeiro.workshopmongo.repository.PostRepository;
import com.lucioribeiro.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
		
    public Post findById(String id) {
        Optional<Post> postOptional = repo.findById(id);
        
        if (postOptional.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

        return postOptional.get();
    }
    
    public List<Post> findByTitle(String text) {
    	return repo.searchTitle(text);
    }
    
    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
    	maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
    	return repo.fullSearch(text, minDate, maxDate);
    }

}
