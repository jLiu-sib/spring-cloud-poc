package com.sib.service.profile;

import com.sib.restclient.profile.ProfileClient;
import com.sib.restclient.profile.dto.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController implements ProfileClient {
    @Autowired
    private ProfileService profileService;

    @Override
    public Profile getProfile(String username) {
        return profileService.findProfileByUsername(username);
    }
}
