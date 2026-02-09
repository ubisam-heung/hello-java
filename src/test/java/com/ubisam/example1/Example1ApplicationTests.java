package com.ubisam.example1;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Example1ApplicationTests {

	@Autowired
	private HelloRepository helloRepository;

	@Test
	void contextLoads() {

		//Insert
		Hello h = new Hello();
		h.setName("name1");
		h.setEmail("abc@ubisam.com");
		helloRepository.save(h);
		

		//Read
		Optional<Hello> h2 = helloRepository.findById(1l);
		// Hello h2 = helloRepository.findById(1L);
		System.out.println("h.getId(): " + h.getId());
		System.out.println("h2.get().getId(): " + h2.get().getId());
		
		//Update
		h.setName("name2");
		helloRepository.save(h);

		//Search
		List<Hello> r = helloRepository.findAll();
		
		System.out.println("r: " + r);

		//Delete
		helloRepository.delete(h);


	}
}
