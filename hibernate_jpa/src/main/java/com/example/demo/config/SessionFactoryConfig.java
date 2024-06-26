//package com.example.demo.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.hibernate.SessionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//
//@Configuration
//public class SessionFactoryConfig {
//
//    @Order(Ordered.LOWEST_PRECEDENCE)
//    @Bean
//    public SessionFactory initSessionFactory(EntityManagerFactory factory) {
//        if (factory.unwrap(SessionFactory.class) == null) {
//            throw new NullPointerException("factory is not a hibernate factory");
//        }
//        return factory.unwrap(SessionFactory.class);
//    }
//}
