package com.vin.stanford.dao;

import java.util.List;

import com.vin.stanford.entity.DepartmentEntity;

public interface DepartmentDAO 
{
	//This method will be called when a Department object is added
    public void addDepartment(DepartmentEntity department);
    //This method return list of Departments in database
    public List<DepartmentEntity> getAllDepartments();
    //Deletes a Department by it's id
    public void deleteDepartment(Integer depId);
    
    public DepartmentEntity getDepartment(Integer depId);
}