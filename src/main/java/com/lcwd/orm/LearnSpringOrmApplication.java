package com.lcwd.orm;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("sarvesh");
		user.setAge(25);
		user.setCity("Bhopal");
		User savedUser = userService.saveUser(user);
		System.out.println(savedUser);

	}
}

//