package edu.npu.courseapp.dao.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import edu.npu.courseapp.dao.ProductsListDao;
import edu.npu.courseapp.domain.Products;

public class ProductsListDaoImpl implements ProductsListDao{
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private ProductListRowMapper prodRowMapper;
	@Override
	public List getProductListAll(int sku) {
		return null;
		
		
	}

	@Override
	public boolean insertProductList(List all) {
		return false;
		
	}

}
