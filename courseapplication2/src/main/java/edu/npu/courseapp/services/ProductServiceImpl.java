package edu.npu.courseapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.npu.courseapp.dao.ProductDAO;
import edu.npu.courseapp.dao.jdbc.ProductDaoJdbcImpl;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.ProductEbay;
@Transactional(rollbackFor={java.io.IOException.class},noRollbackFor = ArithmeticException.class)
@Service
public class ProductServiceImpl implements ProductService {
	@Qualifier("ProductDaoJdbcImpl")
	@Autowired
	private ProductDAO  ProductDao=new ProductDaoJdbcImpl();
	

	@Override
	public List<Product> getintList(int suk) {
		List<Product> produ = ProductDao.getProductList(suk);
		System.out.println(produ);
		return produ;	
	}


	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		ProductDao.deletePro(id);
	}


	@Override
	public List<Product> getintList() {
		List<Product> produ = ProductDao.getProductallList();
		
		return produ;
	}


	@Override
	public List<Product> getProductByName(String name) {
		List<Product>prodList=(List<Product>) ProductDao.findProdByName(name);
		return prodList;
	}
	
	@Override
	public void insertProduct(List<Product> product) {
		 ProductDao.insertProduct(product);
	}


	@Override
	public void insertProductEbay(List<ProductEbay> product) {
		 ProductDao.insertProductEbay( product);
		
	}
}
