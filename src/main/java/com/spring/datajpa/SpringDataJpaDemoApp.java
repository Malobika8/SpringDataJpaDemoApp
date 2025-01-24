package com.spring.datajpa;

import com.spring.datajpa.config.AppConfig;
import com.spring.datajpa.dao.PersonDao;
import com.spring.datajpa.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDataJpaDemoApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonDao personDao = applicationContext.getBean("personDao", PersonDao.class);

        //Save person
        Person person = new Person();
        person.setName("Lisa");
        person.setAddress("bbs");
        personDao.save(person);
    }
}
