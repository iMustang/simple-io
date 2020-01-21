package com.xmustang;

/**
 * com.xmustang.Wheel
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 11:16 上午
 */
public class Wheel {
    private String brand;
    private String specification;

    public Wheel(String brand, String specification) {
        this.brand = brand;
        this.specification = specification;
    }

    public Wheel() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
