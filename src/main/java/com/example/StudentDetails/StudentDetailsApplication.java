package com.example.StudentDetails;

import com.example.StudentDetails.StudentRepository.studentRepository;
import com.example.StudentDetails.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentDetailsApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
