package com.pv207.petfriend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;


@SpringBootApplication
//public class Initializer extends SpringBootServletInitializer {
public class Initializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Initializer.class, args);
    }


    @Autowired
    private UserProfileDao userProfileDao;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        UserProfile userProfile = new UserProfile();
        userProfile.setForename("Joe");
        userProfile.setSurname("Doe");
        userProfile.setCity("Brno");
        userProfile.setEmail("jdoe@xyz.com");
        userProfile.setUsername("joe1234");
        userProfile.setPassword("72136821");
        userProfile.setId("62c432f9-bffe-4fd0-b9b6-fc1d0ce744bb");
        userProfileDao.save(userProfile);
    }


}
