package edu.npu.courseapp.services;

import java.util.List;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.ProductEbay;



public interface ProductService {
	public List<Product> getintList();
	public void deleteProduct(Integer id);
	public List<Product> getintList(int suk);
	public List<Product> getProductByName(String name);
	void insertProduct(List<Product> product);
	void insertProductEbay(List<ProductEbay> product);
}
