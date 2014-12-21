package edu.npu.courseapp.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.ProductEbay;


	public class ProductRowMapperEbay implements RowMapper<ProductEbay>{

	

	@Override
	public ProductEbay mapRow(ResultSet rs, int rowNum) throws SQLException {

		String name;
		String title;
		String itemId;
		String currentPrice;
		String listingType;
		
		name = rs.getString("name");
		title = rs.getString("title");
		itemId = rs.getString("itemId");
		currentPrice = rs.getString("currentPrice");
		listingType = rs.getString("listingType");
		
		
		
		ProductEbay product = new ProductEbay();
		
		product.setName(name);
		product.setTitle(title);
		product.setItemId(itemId);
		product.setPrice(currentPrice);
		product.setListingType(listingType);
		return product;

	}
}
