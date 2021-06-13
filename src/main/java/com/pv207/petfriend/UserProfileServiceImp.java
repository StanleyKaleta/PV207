package com.pv207.petfriend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImp implements UserProfileService {

    @Autowired
    UserProfileDao userProfileDao;

    @Override
    public List<UserProfile> listAll() {
        return (List<UserProfile>) userProfileDao.findAll();
    }

    @Override
    public UserProfile find(String id) {
        return userProfileDao.findById(id).get();
    }

    @Override
    public String update(UserProfile userProfile) {
        return userProfileDao.save(userProfile).id;
    }
}
