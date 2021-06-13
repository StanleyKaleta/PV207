package com.pv207.petfriend;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfileDto {

    private String forname;
    private String surname;
    private String email;
    private String city;
    private String userName;
    private Integer password;

    @Override
    public String toString() {
        return "UserProfileDto{" +
                "forname='" + forname + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
