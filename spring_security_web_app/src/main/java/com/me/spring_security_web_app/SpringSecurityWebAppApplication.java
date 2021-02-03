package com.me.spring_security_web_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.me.spring_security_web_app.entities.User;
import com.me.spring_security_web_app.repositories.UserRepository;

@SpringBootApplication
public class SpringSecurityWebAppApplication implements CommandLineRunner {

	@Autowired
	private UserRepository uRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User hung = new User();
		User phuong = new User();
		hung.setEmail("hung@gmail.com");
		hung.setName("Hung");
		hung.setPassword(passwordEncoder.encode("hungvudang"));
		hung.setRole(1);

		phuong.setEmail("phuong@gmail.com");
		phuong.setName("phuong");
		phuong.setPassword(passwordEncoder.encode("phuongnguyenthi"));
		phuong.setRole(0);

		uRepository.save(hung);
		uRepository.save(phuong);

	}

}
