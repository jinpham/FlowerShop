package flower_shop.service;

import flower_shop.model.Catalog;

import java.util.List;
public interface CategoryService {
	void insert(Catalog category);

	void edit(Catalog category);

	Catalog get(int id);
	
	Catalog get(String name);

	List<Catalog> getAll();

	void delete(String id);
	
	List<Catalog> getCateByProduct(int id);

}

