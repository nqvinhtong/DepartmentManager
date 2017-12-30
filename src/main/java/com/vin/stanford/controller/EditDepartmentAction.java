package com.vin.stanford.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vin.stanford.entity.DepartmentEntity;
import com.vin.stanford.service.DepartmentManager;

public class EditDepartmentAction extends ActionSupport implements ModelDriven<DepartmentEntity>	
{
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(EditDepartmentAction.class);
	private List<DepartmentEntity> departments;
	private DepartmentEntity department = new DepartmentEntity();
	
	//Department manager injected by spring context;
	private DepartmentManager departmentManager;
	
	public String execute()
	{
		return "departmentList";
	}
	
	@Override
	public DepartmentEntity getModel() {
		return department;
	}

	//This method return list of department in database
	public String listDepartments() {
		logger.info("get all department method called");
		departments = departmentManager.getAllDepartments();
		return "departmentList";
	}

	//This method will be called when a department object is added
	public String addDepartment() {
		logger.info("add department method called");
		departmentManager.addDepartment(department);
		return SUCCESS;
	}

	//Deletes a department by it's id passed in path parameter
	public String deleteDepartment() {
		logger.info("delete department method called");
		departmentManager.deleteDepartment(department.getId());
		return SUCCESS;
	}
	
	public String editDepartment() {
		logger.info("edit department method called");
		
		department = departmentManager.getDepartmentById(department.getId());
		
//		System.out.println("VVV: " + department.getId() + " Name: " + department.getDepartmentName());
		
		return "editDepartment";
	}
	
	public List<DepartmentEntity> getDepartments() {
		return departments;
	}

	public void setDepartments(List<DepartmentEntity> departments) {
		this.departments = departments;
	}

	public DepartmentEntity getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}

}
