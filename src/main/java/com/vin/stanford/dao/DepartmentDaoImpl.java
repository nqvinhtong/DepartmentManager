package com.vin.stanford.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vin.stanford.entity.DepartmentEntity;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDAO  
{
	//Session factory injected by spring context
    private SessionFactory sessionFactory;
	
    //This method will be called when a Department object is added
	@Override
	public void addDepartment(DepartmentEntity department) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(department);
	}

	//This method return list of Departments in database
	@SuppressWarnings("unchecked")
	@Override
	public List<DepartmentEntity> getAllDepartments() {
		return this.sessionFactory.getCurrentSession().createQuery("from DepartmentEntity").list();
	}

	//Deletes a Department by it's id
	@Override
	public void deleteDepartment(Integer depId) {
		DepartmentEntity department = (DepartmentEntity) sessionFactory.getCurrentSession()
										.load(DepartmentEntity.class, depId);
        if (null != department) {
        	this.sessionFactory.getCurrentSession().delete(department);
        }
	}

	//This setter will be used by Spring context to inject the sessionFactory instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public DepartmentEntity getDepartment(Integer depId) {
		DepartmentEntity department = (DepartmentEntity) sessionFactory.getCurrentSession().get(DepartmentEntity.class, depId);
		
//		DepartmentEntity dep = (DepartmentEntity) this.sessionFactory.getCurrentSession().get(DepartmentEntity.class, depId);
		
		return department;
	}
}
