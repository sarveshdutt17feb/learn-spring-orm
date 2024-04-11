package com.lcwd.orm;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(LearnSpringOrmApplication.class);
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("sarvesh");
//		user.setAge(25);
//		user.setCity("Bhopal");
//		User savedUser = userService.saveUser(user);
//		List<User> users = userService.getAllUser();
//		logger.info("user size is: {} ",users.size());
//		logger.info("Users {} ",users);

		User user = userService.getUser(10);
		logger.info("user with "+user.getId()+" {} ",user);
	}
}

//