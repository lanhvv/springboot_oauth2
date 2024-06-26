package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentGFGDetail;
import com.example.demo.service.StudentGFGDetailService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Service
public class StudentGFGDetailServiceImpl implements StudentGFGDetailService {
    private final SessionFactory sessionFactory;

    public StudentGFGDetailServiceImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add() {
        try(Session session = sessionFactory.openSession()) {
            // cascade : create
            Student student = new Student("JJ", "Olatunji",
                    "jj@gmail.com");

            StudentGFGDetail studentGfgDetail
                    = new StudentGFGDetail("GFG College", "0");
            student.setStudentGFGDetail(studentGfgDetail);
            studentGfgDetail.setStudent(student);

            session.beginTransaction();
            session.save(studentGfgDetail);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(long id) {

    }
}
