package com.vlpc.users.service;


import com.vlpc.users.dto.UserDto;
import com.vlpc.users.mapper.Mapper;
import com.vlpc.users.model.Position;
import com.vlpc.users.model.User;
import com.vlpc.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private Mapper mapper;

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }

    public User saveUser(UserDto userDto){
        return userRepository.save(mapper.toEntity(userDto));
    }

    public User updateUser(Long id, String firstName, String lastName, Position position, boolean admin){
        User user = userRepository.findById(id).get();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPosition(position);
        user.setAdmin(admin);
        userRepository.save(user);
        return user;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public Iterable<User> findAllUsers(){
        return userRepository.findAll();
    }
}
