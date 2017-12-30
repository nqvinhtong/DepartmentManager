package com.vin.stanford.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vin.stanford.entity.EmployeeEntity;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDAO  
{
	//Session factory injected by spring context
    private SessionFactory sessionFactory;
	
    //This method will be called when a employee object is added
	@Override
	public void addEmployee(EmployeeEntity employee) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	//This method return list of employees in database
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeEntity> getAllEmployees() {
		return this.sessionFactory.getCurrentSession().createQuery("from EmployeeEntity").list();
	}

	//Deletes a employee by it's id
	@Override
	public void deleteEmployee(Integer employeeId) {
		EmployeeEntity employee = (EmployeeEntity) sessionFactory.getCurrentSession()
										.load(EmployeeEntity.class, employeeId);
        if (null != employee) {
        	this.sessionFactory.getCurrentSession().delete(employee);
        }
	}

	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public EmployeeEntity getEmployee(Integer empId) {
		EmployeeEntity employee = (EmployeeEntity) sessionFactory.getCurrentSession().get(EmployeeEntity.class, empId);
		
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeEntity> findEmployees(String search) {
		
		List<EmployeeEntity> empList = sessionFactory.getCurrentSession()
			.createQuery("from EmployeeEntity where lower(firstname) like lower(:search) or lower(lastname) like lower(:search)")
			.setParameter("search", search+"%")
			.list();
		
		return empList;
	}
}
