package com.lucioribeiro.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucioribeiro.workshopmongo.domain.User;
import com.lucioribeiro.workshopmongo.dto.UserDTO;
import com.lucioribeiro.workshopmongo.repository.UserRepository;
import com.lucioribeiro.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
    public User findById(String id) {
        Optional<User> userOptional = repo.findById(id);
        
        if (userOptional.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }

        return userOptional.get();
    }
    
    public User insert(User obj) {
    	return repo.insert(obj);
    }
    
    public User fromDTO(UserDTO objDto) {
    	return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
