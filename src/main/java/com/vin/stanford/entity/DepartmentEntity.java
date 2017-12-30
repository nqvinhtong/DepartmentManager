package com.vin.stanford.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class DepartmentEntity {
     
	@Id
    @Column(name="DEP_ID")
    @GeneratedValue
    private Integer id;
    
	@Column(name="DEPARTMENT_NAME")
    private String departmentName;
 
    @Column(name="MANAGER_NAME")
    private String managerName;
    
//    @OneToMany(mappedBy="department")
//    private Set<EmployeeEntity> employees;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
//	public Set<EmployeeEntity> getEmployees() {
//		return this.employees;
//	}
//    public void setEmployees(Set<EmployeeEntity> employees) {
//		this.employees = employees;
//	}
}