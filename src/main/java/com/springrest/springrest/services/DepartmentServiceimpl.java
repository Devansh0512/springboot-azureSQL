package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.DepartmentDao;
import com.springrest.springrest.entities.Department;

@Service
public class DepartmentServiceimpl implements DepartmentService {

    //List<Department> list;

    @Autowired
    private DepartmentDao departmentDao;

    public DepartmentServiceimpl(){
        // list=new ArrayList<>();
        // list.add(new Department(1,"Computer Science and Engineering","CSE"));
        // list.add(new Department(2,"Mechanical Engineering","BME"));

    }

    //get all departments
    @Override
    public List<Department> getDepartments() {
        //return list;

        return departmentDao.findAll();
    }

    //get single dept
    @Override
    public Department getDepartment(long departmentId) {
        // Department d=null;
        // for(Department dept:list){
        //     if(dept.getId()==departmentId){
        //         d=dept;
        //         break;
        //     }
        // }
        // return d;

        return departmentDao.getOne(departmentId);
    }

    //add a dept
    @Override
    public Department addDepartment(Department department) {
        // list.add(department);
        // return department;

        departmentDao.save(department);
        return department;
    }

    //update a department
    @Override
    public Department updateDepartment(Department department) {
        // list.forEach(e->{
        //     if(e.getId()==department.getId()){
        //         e.setTitle(department.getTitle());
        //         e.setCode(department.getCode());
        //     }
        // });
        // return department;

        departmentDao.save(department);
        return department;
    }

    //delete a department
    @Override
    public void deleteDepartment(long parseLong) {
        //list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());

        Department d=departmentDao.getOne(parseLong);
        departmentDao.delete(d);
    }
    
}
