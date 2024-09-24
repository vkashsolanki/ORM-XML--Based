package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.StudentDao;
import com.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/orm/config.xml");
       StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
       Student student = new Student(101, "Rama", "Delhi");
       int insert = studentDao.insert(student);
       System.out.println("Done "+insert);
    }
}
