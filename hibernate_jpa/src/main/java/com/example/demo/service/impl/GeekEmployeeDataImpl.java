package com.example.demo.service.impl;

import com.example.demo.entity.GeekEmployeeData;
import com.example.demo.entity.SkillSetData;
import com.example.demo.service.GeekEmployeeDataSerice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class GeekEmployeeDataImpl implements GeekEmployeeDataSerice {

    private final SessionFactory sessionFactory;

    public GeekEmployeeDataImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add() {
        try (Session session = this.sessionFactory.openSession()) {
            session.beginTransaction();
            Set<SkillSetData> setData = new HashSet<>();
            setData.add(session.get(SkillSetData.class, 1L));
            setData.add(session.get(SkillSetData.class, 2L));
            GeekEmployeeData geekEmployeeData = new GeekEmployeeData("Kame", "hame", 1_000_000_000, setData);
            session.save(geekEmployeeData);
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
