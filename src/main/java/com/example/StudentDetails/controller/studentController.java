package com.example.StudentDetails.controller;
import com.example.StudentDetails.StudentService.studentService;
import com.example.StudentDetails.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class studentController {
    @Autowired
    studentService service;

    @GetMapping("/StudentDetails/{studentNumber}")
    public List<Student> getStudent(@PathVariable String studentNumber){
        return service.getByNumber(studentNumber);


    }
    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Student studentDTO) {
        service.saveOrUpdateStudent(studentDTO);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }

}
