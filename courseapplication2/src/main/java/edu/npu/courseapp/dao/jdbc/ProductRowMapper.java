package edu.npu.courseapp.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Product;

public class ProductRowMapper implements RowMapper<Product>{{

}

@Override
public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

	String name;
	String longDescription;
	double sku;
	name = rs.getString("name");
	longDescription = rs.getString("longDescription");
	sku = rs.getDouble("sku");
	
	Product product = new Product();
	
	product.setLongDescription("longDescription");
	product.setName("name");
	product.setSku(sku);
	return product;

}
}
