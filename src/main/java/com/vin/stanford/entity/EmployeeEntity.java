package com.vin.stanford.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
     
	@Id
    @Column(name="EMP_ID")
    @GeneratedValue
    private Integer id;
    
    @Column(name="DEP_ID")
    private Integer depId;
    
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "DEP_ID", nullable = false)
//    private DepartmentEntity department;
    
    @Column(name="FIRSTNAME")
    private String firstname;
    
    @Column(name="LASTNAME")
    private String lastname;
    
    @Column(name="EMAIL")
    private String email;
    
    @Column(name="TELEPHONE")
    private String telephone;
     
	
    public String getEmail() {
        return email;
    }
	
    public String getTelephone() {
        return telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}
    
//	public DepartmentEntity getDepartment() {
//		return this.department;
//	}
//
//	public void setDepartment(DepartmentEntity department) {
//		this.department = department;
//	}
	
}