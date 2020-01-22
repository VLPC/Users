package com.vlpc.users.mapper;


import com.vlpc.users.dto.UserDto;
import com.vlpc.users.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    @Autowired
    private ModelMapper modelMapper;

    public User toEntity(UserDto userDto){
        return modelMapper.map(userDto, User.class);
    }

    public UserDto toDto(User user){
        return new UserDto(user.getFirstName(), user.getLastName(), user.getPosition(), user.isAdmin());
    }
}
