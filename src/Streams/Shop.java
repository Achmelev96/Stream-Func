package Streams;

import java.util.Objects;

public class Shop {

    private String name;
    private int income;
    private int area;

    public Shop(String name, int income, int area) {
        this.name = name;
        this.income = income;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return income == shop.income && area == shop.area && Objects.equals(name, shop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, income, area);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", area=" + area +
                '}';
    }
}
