package com.sib.service.profile;

import com.sib.restclient.profile.dto.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    public Profile findProfileByUsername(String username) {
        Profile profile = new Profile();
        profile.setUsername(username);
        profile.setFirstName("Ke");
        profile.setLastName("Ban");
        return profile;
    }
}
