package com.java.streamAPI;

import java.util.ArrayList;
import java.util.function.Function;

class User {
    String name;
    String password;
    int salary;

    public User(String name, String password, int salary) {
        this.name = name;
        this.password = password;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class UserDTO {
    String name;
    int salary;

    public UserDTO(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class StreamMapDemo {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ramesh", "Password", 1000));
        users.add(new User("Ram", "Password", 200));
        users.add(new User("Sham", "Password", 4000));

        users.stream()
                .map(new Function<User, UserDTO>() {

                    @Override
                    public UserDTO apply(User user) {
                        return new UserDTO(user.getName(), user.getSalary());
                    }
                }).forEach(System.out::println);

        System.out.println("********************************");

        // Using lambda expression

        users.stream()
                .map((user) -> new UserDTO(user.getName(), user.getSalary()))
                .forEach(System.out::println);


    }
}
