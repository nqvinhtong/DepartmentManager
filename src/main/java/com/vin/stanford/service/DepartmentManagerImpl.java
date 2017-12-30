package com.vin.stanford.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.vin.stanford.dao.DepartmentDAO;
import com.vin.stanford.entity.DepartmentEntity;
import com.vin.stanford.entity.Item;

public class DepartmentManagerImpl implements DepartmentManager {
	//Department dao injected by Spring context
    private DepartmentDAO departmentDAO;
	
	//This method will be called when a Department object is added
	@Override
	@Transactional
	public void addDepartment(DepartmentEntity Department) {
		departmentDAO.addDepartment(Department);
	}
	
	//This method return list of Departments in database
	@Override
	@Transactional
	public List<DepartmentEntity> getAllDepartments() {
		return departmentDAO.getAllDepartments();
	}
	
	@Override
	public List<Item> getDepartmentItems() {
		List<Item> depItems = new ArrayList<Item>();
		List<DepartmentEntity> departments = departmentDAO.getAllDepartments();
		
		for (DepartmentEntity department : departments) {
			depItems.add(new Item(department.getId(), department.getDepartmentName()));
		}
		return depItems;
	}
	
	//Deletes a Department by it's id
	@Override
	@Transactional
	public void deleteDepartment(Integer DepartmentId) {
		departmentDAO.deleteDepartment(DepartmentId);
	}
	
	//This setter will be used by Spring context to inject the dao's instance
	public void setDepartmentDAO(DepartmentDAO DepartmentDAO) {
		this.departmentDAO = DepartmentDAO;
	}

	@Override
	public DepartmentEntity getDepartmentById(Integer id) {
		return departmentDAO.getDepartment(id);
	}
}
