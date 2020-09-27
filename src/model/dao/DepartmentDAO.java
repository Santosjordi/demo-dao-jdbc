package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer Id);
	Department findById(Integer Id);
	List<Department> findAll();
}
