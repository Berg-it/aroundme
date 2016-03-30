package de.sambi.arroundme.dao;

import java.util.List;

import de.sambi.arroundme.model.DepartmentEntity;
import de.sambi.arroundme.model.EmployeeEntity;

public interface EmployeeDAO 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}