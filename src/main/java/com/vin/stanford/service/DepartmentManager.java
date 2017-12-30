package com.vin.stanford.service;

import java.util.List;

import com.vin.stanford.entity.DepartmentEntity;
import com.vin.stanford.entity.Item;

public interface DepartmentManager {
    public void addDepartment(DepartmentEntity department);
    public List<DepartmentEntity> getAllDepartments();
    public DepartmentEntity getDepartmentById(Integer id);
    public void deleteDepartment(Integer depId);
    
    public List<Item> getDepartmentItems();
}
