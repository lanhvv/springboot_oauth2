package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentGFGDetail;
import com.example.demo.service.StudentGFGDetailService;
import com.example.demo.service.StudentService;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final SessionFactory sessionFactory;

    public StudentServiceImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void add() {
        try(Session session = sessionFactory.openSession()) {
            // cascade : create
            Student student = new Student("KAKA", "KEKE", "abc@gmail.com");
            StudentGFGDetail studentGFGDetailService = new StudentGFGDetail("GFG College", "20");
            student.setStudentGFGDetail(studentGFGDetailService);
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, 1);
            student.setEmail("dmm@gmail.com");
            session.update(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.remove(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
