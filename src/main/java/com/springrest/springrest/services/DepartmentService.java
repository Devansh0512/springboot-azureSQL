package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Department;

public interface DepartmentService {
    
    public List<Department> getDepartments(); 

    public Department getDepartment(long departmentId);

    public Department addDepartment(Department department);

    public Department updateDepartment(Department department);

    public void deleteDepartment(long parseLong);
}
