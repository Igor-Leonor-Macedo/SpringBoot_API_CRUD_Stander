package com.API.cad.user.Mapper;

import com.API.cad.user.DTO.Request.UserRequest;
import com.API.cad.user.DTO.Response.UserResponse;
import com.API.cad.user.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toDTO(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getPhoneNumber()
        );
    }

    public User toEntity(UserRequest userRequest) {

        User user = new User();
        user.setName(userRequest.getName());
        user.setPhoneNumber(userRequest.getPhoneNumber());

        return user;
    }
}
