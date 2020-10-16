package com.sib.portal.ebank.individual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.sib.restclient")
public class IndividualEBankPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndividualEBankPortalApplication.class, args);
	}

}
