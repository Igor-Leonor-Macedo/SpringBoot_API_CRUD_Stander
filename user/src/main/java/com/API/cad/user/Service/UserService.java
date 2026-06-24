package com.API.cad.user.Service;

import com.API.cad.user.DTO.Request.UserRequest;
import com.API.cad.user.DTO.Response.UserResponse;
import com.API.cad.user.Entity.User;
import com.API.cad.user.Mapper.UserMapper;
import com.API.cad.user.Repository.UserRepository;
import jakarta.transaction.Transactional;
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

    public UserResponse create(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
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
