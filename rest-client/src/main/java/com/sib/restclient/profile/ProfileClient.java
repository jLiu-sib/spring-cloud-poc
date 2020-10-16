package com.sib.restclient.profile;

import com.sib.restclient.profile.dto.Profile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "service-profile")
public interface ProfileClient {
    @GetMapping("profile/{username}")
    Profile getProfile(@PathVariable String username);
}
