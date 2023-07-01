package com.amk.assigment;

import com.amk.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployee {

     List<Employee> list = null;

     public FilterEmployee(){
          list = new ArrayList<>();
     }

     public List<Employee> iTEmployees(List<Employee> list){
          return list.stream().filter(i -> i.getDept().equals("IT")).toList();
     }


}
