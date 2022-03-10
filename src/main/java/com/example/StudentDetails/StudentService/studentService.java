package com.example.StudentDetails.StudentService;

import com.example.StudentDetails.StudentRepository.studentRepository;
import com.example.StudentDetails.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class studentService {
    @Autowired
    studentRepository repository;

    public List<Student> getByNumber(String student) {
        List<Student> numberList=repository.findbyNumber(student);
        if(numberList==null){
            // return numberList.getClass();
        }
      return numberList;
    }

    public Student saveOrUpdateStudent( Student student) {
        return repository.save(student);


    }

}
