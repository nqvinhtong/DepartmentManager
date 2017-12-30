package com.vin.stanford.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vin.stanford.entity.EmployeeEntity;
import com.vin.stanford.entity.Item;
import com.vin.stanford.service.DepartmentManager;
import com.vin.stanford.service.EmployeeManager;

public class EditEmployeeAction extends ActionSupport implements ModelDriven<EmployeeEntity>
{
	private static final long serialVersionUID = 1L;
	
	//Logger configured using log4j
	private static final Logger logger = Logger.getLogger(EditEmployeeAction.class);
	//List of employees; Setter and Getter are below
	private List<EmployeeEntity> employees;
	//Employee object to be added; Setter and Getter are below
	private EmployeeEntity employee = new EmployeeEntity();
	
	//Employee manager injected by spring context; This is cool !!
	private EmployeeManager employeeManager;
	private DepartmentManager departmentManager;
	
	private List<Item> departmentItems;
	private String search;
	
	@Override
	public EmployeeEntity getModel() {
		return employee;
	}

	//This method return list of employees in database
	public String listEmployees() {
		if (search != null && search.length() > 0) {
			employees = employeeManager.searchEmployees(search);
		} else {
			employees = employeeManager.getAllEmployees();
		}
		logger.info("listEmployees method called");
		
		
		departmentItems = departmentManager.getDepartmentItems();
		return "employeeList";
	}

	//This method will be called when a employee object is added
	public String addEmployee() {
		logger.info("addEmployee method called");

		employeeManager.addEmployee(employee);
		return SUCCESS;
	}

	//Deletes a employee by it's id passed in path parameter
	public String deleteEmployee() {
		logger.info("deleteEmployee method called");
		employeeManager.deleteEmployee(employee.getId());
		return SUCCESS;
	}
	
	public String editEmployee() {
		logger.info("edit employee method called");
		
		employee = employeeManager.getEmployeeById(employee.getId());
		departmentItems = departmentManager.getDepartmentItems();
		
		return "editEmployee";
	}
	
	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public List<Item> getDepartmentItems() {
		return departmentItems;
	}

	public void setDepartmentItems(List<Item> departmentItems) {
		this.departmentItems = departmentItems;
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
}
