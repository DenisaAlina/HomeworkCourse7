package com.fasttrack;

public class Person {
    private int age;
    private String name;
    private boolean married;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return married;
    }

    public Person(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", married=" + married +
                '}';
    }
}
