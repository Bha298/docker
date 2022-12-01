package com.java.docker.server;

import com.java.docker.entity.Student;
import com.java.docker.rep.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceImp {

    @Autowired
    private StudentRep studentRep;

    @Override
    public Student postId(Student student) {
        return studentRep.save(student);
    }
}
