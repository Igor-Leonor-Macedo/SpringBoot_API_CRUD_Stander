package com.API.cad.user.Service;

import com.API.cad.user.DTO.Request.UserRequest;
import com.API.cad.user.DTO.Response.UserResponse;
import com.API.cad.user.Entity.User;
import com.API.cad.user.Exception.ExistingPhoneNumber;
import com.API.cad.user.Exception.NotFoundUser;
import com.API.cad.user.Mapper.UserMapper;
import com.API.cad.user.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void create(UserRequest userRequest) {
        if (userRepository.existsByPhoneNumber(userRequest.getPhoneNumber())) {
            throw new ExistingPhoneNumber("Phone number already exists");
        }
        User user = userMapper.toEntity(userRequest);
        userRepository.save(user);
    }

    public UserResponse findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundUser("Usuário não encontrado com id: " + id));
        return userMapper.toDTO(user);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElseThrow();
        existingUser.setName(user.getName());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        User existingUser = userRepository.findById(id).orElseThrow();
        userRepository.delete(existingUser);
    }
}
