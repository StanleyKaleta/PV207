package com.pv207.petfriend;


import java.util.List;

public interface UserProfileService {

    List<UserProfile> listAll();

    UserProfile find(String id);

    String update(UserProfile userProfile);
}
