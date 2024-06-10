//package com.example.demo.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.hibernate.SessionFactory;
//import org.springframework.context.annotation.Bean;
//
//@org.springframework.context.annotation.Configuration
//public class SessionFactoryConfig {
//
//
//    @Bean
//    public SessionFactory initSessionFactory(EntityManagerFactory factory) {
//        if (factory.unwrap(SessionFactory.class) == null) {
//            throw new NullPointerException("factory is not a hibernate factory");
//        }
//        return factory.unwrap(SessionFactory.class);
//    }
//}
