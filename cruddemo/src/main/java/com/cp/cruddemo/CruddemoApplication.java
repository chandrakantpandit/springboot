package com.cp.cruddemo;

import com.cp.cruddemo.dao.StudentDAO;
import com.cp.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating the student: ");
        Student student = new Student("Akshara", "Pandit", "aaa@gmail.com");
        System.out.println("Saving the student: ");
        studentDAO.save(student);
        System.out.println("Saved student id is: " + student.getId());

        Student temp = studentDAO.findById(student.getId());
        System.out.println("Added student is : " + temp);

        System.out.println(studentDAO.findAll());
    }

}
