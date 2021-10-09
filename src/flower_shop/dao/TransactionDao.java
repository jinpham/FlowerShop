package flower_shop.dao;
import java.util.List;

import flower_shop.model.Transactions;


public interface TransactionDao {
	void insert(Transactions transaction); 
	 
	void edit(Transactions admin); 
	
	void delete(String id); 
 
	Transactions get(int id); 
	 
	Transactions get(String name); 
 
	List<Transactions> getAll();

	List<Transactions> sort();
	
//	void count(Transactions transactions);
}
