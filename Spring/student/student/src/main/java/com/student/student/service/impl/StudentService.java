package com.student.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.model.Student;
import com.student.student.repository.IStudentRepository;
import com.student.student.service.IStudentService;


@Service
public class StudentService implements IStudentService{

    @Autowired
    IStudentRepository studentRepository;

    @Override
    public Student insertStudent(Student student) {
        // TODO Auto-generated method stub
        return studentRepository.insertStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        // TODO Auto-generated method stub
        return studentRepository.getAllStudents();
    }

    @Override
    public Student updateStudent(int id, Student student) {
        // TODO Auto-generated method stub
        return studentRepository.updateStudent(id, student);
    }

    @Override
    public Student deleteStudent(int id) {
        // TODO Auto-generated method stub
        return studentRepository.deleteStudent(id);
    }

   

    
}
