package com.vlpc.users.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name = "lastName")
    private String lastName;

    @NotNull
    @Column(name = "position")
    private String position;

    private Access userAccess;

    public User(String firstName, String lastName, String position, Access access){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPosition(position);
        this.setUserAccess(access);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Access getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(Access userAccess) {
        this.userAccess = userAccess;
    }
}
