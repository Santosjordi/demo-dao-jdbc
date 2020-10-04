package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao dpDao= DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		Department dep = dpDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list = dpDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n==== Test3: department insert =======");
		Department newDp = new Department(null, "Schenanigans");
		dpDao.insert(newDp);
		System.out.println("Sucess! New department id: " + newDp.getId());
		
		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = dpDao.findById(1);
		dep2.setName("Food");
		dpDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		dpDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
		
	}
}
