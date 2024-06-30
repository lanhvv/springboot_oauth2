package com.example.demo.service.impl;

import com.example.demo.entity.SkillSetData;
import com.example.demo.service.SkillSetDataService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Service
public class SkillSetDataImpl implements SkillSetDataService {
    private final SessionFactory sessionFactory;

    public SkillSetDataImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add() {
        try(Session session = this.sessionFactory.openSession()) {
            SkillSetData skillSetData1 = new SkillSetData("read");
            SkillSetData skillSetData2 = new SkillSetData("write");
            session.beginTransaction();
            session.save(skillSetData1);
            session.save(skillSetData2);
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
