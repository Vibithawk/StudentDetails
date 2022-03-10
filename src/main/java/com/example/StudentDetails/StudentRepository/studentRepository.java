package com.example.StudentDetails.StudentRepository;

import com.example.StudentDetails.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepository extends MongoRepository<Student,String> {

    @Query("{studentNumber:?0}")
    List<Student> findbyNumber(String student);

}
