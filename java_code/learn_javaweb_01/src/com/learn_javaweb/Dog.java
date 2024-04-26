package com.learn_javaweb;

import java.util.Objects;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
