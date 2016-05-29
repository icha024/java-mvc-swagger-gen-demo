package com.clianz.example;

import java.util.concurrent.Callable;

import io.swagger.api.MeApi;
import io.swagger.api.NotFoundException;
import io.swagger.model.Profile;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeService implements MeApi {
	@Override
	public Callable<ResponseEntity<Profile>> meGet() throws NotFoundException {
		return () -> {
			Profile profile = new Profile();
			profile.setFirstName("Ian");
			return new ResponseEntity<>(profile, HttpStatus.OK);
		};
	}
}
