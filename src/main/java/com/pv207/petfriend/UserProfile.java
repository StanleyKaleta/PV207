package com.pv207.petfriend;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user_profile")
@EqualsAndHashCode(of = "id")
public class UserProfile {

    @Id
    protected String id = UUID.randomUUID().toString();

    @Column(name = "forename")
    private String forename;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;
}
