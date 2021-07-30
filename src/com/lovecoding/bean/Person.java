package com.lovecoding.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="reperson")
public class Person {
    @Value("鲲鲲")
    private String name;
    @Value("男")
    private String sex;
    @Value("7584930")
    private String ID;
    @Autowired
    private Car car;
    Person(){

    }
    Person(String name,String ID){
        this.name=name;
        this.ID=ID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", ID='" + ID + '\'' +
                ", car=" + car +
                '}';
    }

}
