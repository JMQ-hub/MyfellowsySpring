package com.lovecoding.test;
import com.lovecoding.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
         Test test = new Test();
         test.testFn3();

    }
    public  void testFn1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    public  void testFn2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:com/lovecoding/injection/injection.xml");
        Person person1 = (Person) applicationContext.getBean("person1");
        Person person2 =(Person)  applicationContext.getBean("person2");
        System.out.println(person1);
        System.out.println(person2);

    }
    public void testFn3(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:com/lovecoding/annotation/annotation.xml");
        Person person3 =(Person) applicationContext.getBean("reperson");
        System.out.println(person3);
    }



}
