package org.school.library.service;

import org.school.library.domain.Client;
import org.school.library.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private IClientRepository clientRepository;

    public ResponseEntity<?> save(Client dto){
        boolean existsByPhone = clientRepository.existsByPhone(dto.getPhone());
        if(existsByPhone) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Client whit phone ["+dto.getPhone()+"] exists");
        Client client = clientRepository.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }
}
