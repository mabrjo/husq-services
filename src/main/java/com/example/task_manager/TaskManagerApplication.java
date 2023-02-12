package com.example.task_manager;

import com.example.task_manager.model.User;
import com.example.task_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TaskManagerApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User matt = new User (1L, "Matt Johnson", "mj", "Regional Sasquatch", "../../../assets/img/mattprofile.jpg", List.of(2L, 3L, 4L, 5L, 6L));
		User ryan = new User(2L, "Ryan Reilson", "rr",  "Alliteration Afficianado", "../../../assets/img/ryanprofile.jpg", List.of(1L, 3L, 4L, 5L, 6L));
		User russ = new User(3L, "Russ Beye", "rb", "Actually Paul Rudd", "../../../assets/img/russprofile.jpg", List.of(1L, 2L, 4L, 5L, 6L));
		User cale = new User(4L, "Cale Cortney", "cc", "Absent Father", "../../../assets/img/default-person.png", List.of(1L, 3L, 2L, 5L, 6L));
		User jordan = new User(5L, "Jordan Clark", "jc", "Victim of Computer Problems", "../../../assets/img/jordanprofile.png", List.of(1L, 3L, 4L, 2L, 6L));
		User rob = new User(6L, "Rob Scheer", "rs", "The only good photo of him that exists", "../../../assets/img/robprofile.png", List.of(1L, 3L, 4L, 5L, 2L));
		User mrhusq = new User(7L, "Mr. Husq", "mh", "I own this site", "../../../assets/img/mrhusqprofile.jpg", List.of(1L, 2L, 3L, 4L, 5L, 6L));
		User test = new User(8L, "Test", "test", "bio", "../../../assets/img/default-person.png", List.of(1L, 2L, 3L));

		User bert = new User(null, "Bert", "bert", "bert", "../../../assets/img/default-person.png", List.of(1L, 2L, 3L));
		User ernie = new User(null, "Ernie", "ernie", "ernie", "../../../assets/img/default-person.png");
		User bigbird = new User(null, "Big Bird", "bigbird", "bigbird", "../../../assets/img/default-person.png");

		matt = userRepository.save(matt);
		ryan = userRepository.save(ryan);
		russ = userRepository.save(russ);
		cale = userRepository.save(cale);
		jordan = userRepository.save(jordan);
		rob = userRepository.save(rob);
		mrhusq = userRepository.save(mrhusq);
		test = userRepository.save(test);
		bert = userRepository.save(bert);
		ernie = userRepository.save(ernie);
		bigbird = userRepository.save(bigbird);

		System.out.println(

		);

	}
}
