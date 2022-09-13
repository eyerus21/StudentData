package com.example.studentdata.config;

import com.example.studentdata.batch.StudentTemplate;
import com.example.studentdata.entity.Student;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;


public class StudentProcessor implements ItemProcessor<StudentTemplate,Student> {


    @Override
    public Student process(StudentTemplate studentTemplate) throws Exception {
        LocalDate dob = LocalDate.of(LocalDate.now().getYear()-studentTemplate.getAge(),1,1);
        Student st = new Student(studentTemplate.getId(),studentTemplate.getFirstName(),studentTemplate.getLastName(),dob,studentTemplate.getGpa());
        //st.setDob(dob);
        return st;
    }
}
