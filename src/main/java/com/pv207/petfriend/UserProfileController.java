package com.pv207.petfriend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rest/user")

public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserProfileDto find(@PathVariable String id) {
        UserProfile userProfile = userProfileService.find(id);
        UserProfileDto userProfileDto = new UserProfileDto();
        userProfileDto.setForname(userProfile.getForename());
        userProfileDto.setSurname(userProfile.getSurname());
        userProfileDto.setCity(userProfile.getCity());
        userProfileDto.setEmail(userProfile.getEmail());
        userProfileDto.setUserName(userProfile.getUsername());
        userProfileDto.setPassword(Integer.valueOf(userProfile.getPassword()));

        return userProfileDto;
    }

    @PostMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable String id, @RequestBody UserProfileDto userProfileDto) {
        UserProfile userProfile = new UserProfile();
        userProfile.setId(id);
        userProfile.setForename(userProfileDto.getForname());
        userProfile.setSurname(userProfileDto.getSurname());
        userProfile.setCity(userProfileDto.getCity());
        userProfile.setEmail(userProfileDto.getEmail());
        userProfile.setUsername(userProfileDto.getUserName());
        userProfile.setPassword(userProfileDto.getPassword().toString());

        userProfileService.update(userProfile);
    }

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody UserProfileDto userProfileDto) {
        UserProfile userProfile = new UserProfile();
        System.out.println("new user id="+userProfile.getId());
        userProfile.setForename(userProfileDto.getForname());
        userProfile.setSurname(userProfileDto.getSurname());
        userProfile.setCity(userProfileDto.getCity());
        userProfile.setEmail(userProfileDto.getEmail());
        userProfile.setUsername(userProfileDto.getUserName());
        userProfile.setPassword(userProfileDto.getPassword().toString());

        userProfileService.update(userProfile);
    }
}
