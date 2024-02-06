package com.example.learnxml.model;

public class Employee {
    int empId;
    String empName;
    EmpAddress address;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
