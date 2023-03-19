package com.github.vinyprogramador.exercisesspring.exercicio01.model.controller;

import com.github.vinyprogramador.exercisesspring.exercicio01.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class SchoolController {

    Student s1 = new Student("Reis", 1, 10.0, 8.0);
    Student s2 = new Student("Diego", 2, 7.0, 5.0);
    List<Student> students = new ArrayList<>();

    //get by id
    @GetMapping
    List<Student> showAllStudents() {
        students.add(s1);
        students.add(s2);
        return students;
    }

    @GetMapping("/{id}")
    Student searchStudent(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    String deleteById(@PathVariable int id) {
        for (Student student : students) {
            if (students.size() > id || id < 0) {
                return "Student not exists";
            }
        }
        students.remove(id);
        return "Student deleted";
    }

    //create new report card
    @PostMapping
    public Student addReportCard(@RequestBody Student newStudent) {
        students.add(newStudent);
        return newStudent;
    }

    @GetMapping("/contagem")
    public String quantityReportCard() {
        return "Quantity od record cards: " + students.size();
    }

    @GetMapping("/melhores")
    public List<Student> showBetters() {
        List<Student> betters = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverage() > 9.5) {
                betters.add(student);
            }
        }
        return betters;
    }

}
