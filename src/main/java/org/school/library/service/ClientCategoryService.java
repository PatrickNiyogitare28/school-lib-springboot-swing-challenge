package org.school.library.service;

import org.school.library.domain.ClientCategory;
import org.school.library.repository.IClientCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientCategoryService {
    @Autowired
    private IClientCategoryRepository clientCategoryRepository;

    public ResponseEntity<?> save(ClientCategory dto){
        boolean existsByName = clientCategoryRepository.existsByName(dto.getName());
        if(existsByName) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Client category whit phone ["+dto.getName()+"] exists");
        ClientCategory category = clientCategoryRepository.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    public List<ClientCategory> getAll(){
        return clientCategoryRepository.findAll();
    }
}
