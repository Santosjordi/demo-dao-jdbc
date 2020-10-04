package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n==== Test5: seller update =======\n Entre com um ID para deletar: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("deleted");
		sc.close();
	}
}
