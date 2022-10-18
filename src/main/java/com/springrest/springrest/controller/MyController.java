package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Department;
import com.springrest.springrest.services.DepartmentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class MyController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to dept app";
    }    
    //get the departments
    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return this.departmentService.getDepartments();
    }

    // get the department using deptId
    @GetMapping("/departments/{departmentId}")
    public Department getDepartment(@PathVariable String departmentId){
        return this.departmentService.getDepartment(Long.parseLong(departmentId));
    }

    //add a dept
    @PostMapping("/departments")
    public Department addDepartment(@RequestBody Department department){
        return this.departmentService.addDepartment(department);
    }

    //update a dept using PUT req
    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department department) {
        
        return this.departmentService.updateDepartment(department);
    }

    //delete a dept
    @DeleteMapping("/departments/{departmentId}")
    public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable String departmentId){
        try {
            this.departmentService.deleteDepartment(Long.parseLong(departmentId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
