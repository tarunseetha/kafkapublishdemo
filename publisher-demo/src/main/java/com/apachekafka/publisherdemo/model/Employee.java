package com.apachekafka.publisherdemo.model;

public class Employee {
    private String name;
    private String dept;
    private String title;

    public Employee() {
    }

    public Employee(String name, String dept, String title) {
        this.name = name;
        this.dept = dept;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
