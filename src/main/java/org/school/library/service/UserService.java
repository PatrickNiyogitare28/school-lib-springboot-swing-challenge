package org.school.library.service;

import org.school.library.domain.User;
import org.school.library.dto.LoginDto;
import org.school.library.repository.IUserRepository;
import org.school.library.utils.APICustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public APICustomResponse login(LoginDto dto){
        User user = userRepository.findByEmail(dto.getEmail());
        if(user == null)
            return new APICustomResponse(false, "Unauthorized access");
        return new APICustomResponse(true, "Successfully logged in");
    }

}
