package com.vlpc.users.dto;

import com.vlpc.users.model.Position;

public class UserDto {
    private String firstName;
    private String lastName;
    private Position position;
    private boolean admin;

    public UserDto(String firstName, String lastName, Position position, boolean admin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.admin = admin;
    }
}
