package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== Test: seller findById =======");
		Seller seller = sellerDao.findById(3);
		
		System.out.println("\n==== Test5: seller update =======");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Inserted! New seller id: " + seller);
	}
}
