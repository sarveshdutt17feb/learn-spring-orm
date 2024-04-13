package com.lcwd.orm;

import com.lcwd.orm.entities.*;
import com.lcwd.orm.repositories.CategoryRepo;
import com.lcwd.orm.repositories.ProductRepo;
import com.lcwd.orm.repositories.StudentRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(LearnSpringOrmApplication.class);
	@Autowired
	private StudentRepository studentRepository;
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
//		userService.deleteUser(2);

		//one to one

//		Student student = new Student();
//		student.setStudentId(13);
//		student.setStudentName("Durgesh Tiwari");
//		student.setAbout("I am a software engineer");
//
//		Laptop laptop = new Laptop();
//		laptop.setModeNumber("1234");
//		laptop.setLaptopId(2341);
//		laptop.setBrand("DELL");
//		//important
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//
//
//		Student save = studentRepository.save(student);
//		logger.info("saved student {} ",save.getStudentName());
//
//	Student student = studentRepository.findById(13).get();
//	logger.info("Name is {} ",student.getStudentName());
//
//	Laptop laptop = student.getLaptop();
//	logger.info("laptop {} {} ",laptop.getBrand(),laptop.getModeNumber());
//  ONE to MANY
//
//		Student student = new Student();
//		student.setStudentName("Ravi");
//		student.setStudentId(124);
//		student.setAbout("I am a software engineer");
//		Address a1 = new Address();
//		a1.setAddressId(131);
//		a1.setStreet("235/luc");
//		a1.setCountry("India");
//		a1.setStudent(student);
//
//		Address a2 = new Address();
//		a2.setAddressId(132);
//		a2.setStreet("236/NYSE");
//		a2.setCountry("USA");
//		a2.setStudent(student);
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//		student.setAddressList(addressList);
//		Student saved = studentRepository.save(student);
//		logger.info("saved student with address {}",saved);

		Product p1 = new Product();
		p1.setpId("pid1");
		p1.setProductName("Iphone 13 pro");

		Product p2 = new Product();
		p2.setpId("pid2");
		p2.setProductName("SAMSUNG ULTRA");

		Product p3 = new Product();
		p3.setpId("pid3");
		p3.setProductName("samsung tv");

		Category category1 = new Category();
		category1.setcId("cid1");
		category1.setTitle("Electronics");

		Category category2 = new Category();
		category2.setcId("cid2");
		category2.setTitle("Mobile Phones");

		List<Product> category1Products = category1.getProducts();
		category1Products.add(p1);
		category1Products.add(p2);
		category1Products.add(p3);


		List<Product> category2Products = category2.getProducts();
		category2Products.add(p2);
		category2Products.add(p1);

		// because of cascade prop product will also get saved
//		categoryRepo.save(category1);
//		categoryRepo.save(category2);
//		Category cat1 = categoryRepo.findById("cid1").get();
//		logger.info("category1 : {} ",cat1.getProducts().size());
//
//		Category cat2 = categoryRepo.findById("cid2").get();
//		logger.info("category2 : {} ",cat2.getProducts().size());

		Product prod1 = productRepo.findById("pid1").get();
		logger.info("cat size  from prod1 {} {}",prod1.getCategories().size(),prod1.getProductName());



	}
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private CategoryRepo categoryRepo;
}

