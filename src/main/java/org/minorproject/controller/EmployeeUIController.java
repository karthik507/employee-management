package org.minorproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeUIController {

    @GetMapping("/page")
    public String getHome(){
        return "EmployeeDashboard";
    }

    @GetMapping("/addEmployee")
    public String addEmployee(){
        return "AddEmployee";
    }


}
