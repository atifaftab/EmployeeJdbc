package com.amk.service;

import com.amk.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public double calculateSalary(int id){
        for(Employee e : employeeList){
            if(e.getId() == id){
                return e.getSalary();
            }
        }
        return 0.0;
    }

    public Employee getEmployee(int id){
        for(Employee e : employeeList){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }


}
