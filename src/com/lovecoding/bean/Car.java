package com.lovecoding.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
//@Component("car1")
@Component("car2")
public class Car {
    private String name;

    private int price;

    public String getName() {
        return name;
    }
    @Value("玛莎拉蒂")
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    @Value("10000000")
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
