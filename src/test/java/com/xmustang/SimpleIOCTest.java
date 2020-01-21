package com.xmustang;

import org.junit.Test;

/**
 * com.xmustang.SimpleIOCTest
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 11:18 上午
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}