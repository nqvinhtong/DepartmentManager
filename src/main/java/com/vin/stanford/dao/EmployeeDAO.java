package com.vin.stanford.dao;

import java.util.List;

import com.vin.stanford.entity.EmployeeEntity;

public interface EmployeeDAO 
{
	//This method will be called when a employee object is added
    public void addEmployee(EmployeeEntity employee);
    //This method return list of employees in database
    public List<EmployeeEntity> getAllEmployees();
    //Deletes a employee by it's id
    public void deleteEmployee(Integer employeeId);
    
    public EmployeeEntity getEmployee(Integer empId);
    public List<EmployeeEntity> findEmployees(String search);
}