package com.example.learnxml.controller;


import com.example.demomultiservices.model.EmpDetails;
import com.example.learnxml.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class empController {

    @RequestMapping(value="/getEmployee",method= RequestMethod.GET)
    public EmpDetails getEmployeeInfo(){
        Employee employee=new Employee();
        EmpDetails detaislemp=new EmpDetails();
            employee.setEmpId(285);
            employee.setEmpName("lakshmi tech guide");
            String uri="http://localhost:8080/getEmployeeDetails";
        RestTemplate restTemplate=new RestTemplate();
        detaislemp=restTemplate.getForObject(uri,EmpDetails.class);
        return detaislemp;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST,produces = "application/xml")
    public Employee saveEmp(@RequestBody Employee emp){
        emp.setEmpId(emp.getEmpId()-6);
      return emp;
    }

}
