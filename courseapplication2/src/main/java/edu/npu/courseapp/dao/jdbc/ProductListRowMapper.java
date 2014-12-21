package edu.npu.courseapp.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.Products;


public class ProductListRowMapper implements RowMapper<Products> {

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		final long serialVersionUID = 1L;
		int currentPage;
		int totalPages;
		int from;
		int to;
		int total;
		String queryTime;
		String totalTime;
		String canonicalUrl;
		boolean partial = false;
		Collection<Products> productList1 = new ArrayList<Products>();
		//currentPage = rs.getCurrentPage();
		
		
		return null;

	}

}
