package com.vin.stanford.service;

import java.util.List;

import com.vin.stanford.entity.EmployeeEntity;

public interface EmployeeManager {
	//This method will be called when a employee object is added
    public void addEmployee(EmployeeEntity employee);
    //This method return list of employees in database
    public List<EmployeeEntity> getAllEmployees();
    //Deletes a employee by it's id
    public void deleteEmployee(Integer employeeId);
    
    public EmployeeEntity getEmployeeById(Integer id);
    
    public List<EmployeeEntity> searchEmployees(String search);
}
