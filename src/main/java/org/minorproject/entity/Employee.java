package org.minorproject.entity;


import javax.persistence.*;

@Entity
@Table(name = "employeesInfo")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String name;
    private Integer age;
    private Double salary;
    private String department;
    private Long contact;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }
}
