package edu.npu.courseapp.dao.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import edu.npu.courseapp.dao.ProductDAO;
import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.ProductEbay;

@Repository("ProductDaoJdbcImpl")
public class ProductDaoJdbcImpl implements ProductDAO {
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private SimpleJdbcInsert jdbcInsertEbay;
	
	private ProductRowMapper prodRowMapper;
	private ProductRowMapperEbay prodRowMapperEbay;
	

	@PostConstruct
	public void setup() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedTemplate = new NamedParameterJdbcTemplate(dataSource);
		 jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("product")
				    .usingColumns("name","longDescription","sku","regularPrice");
		 jdbcInsertEbay = new SimpleJdbcInsert(dataSource).withTableName("productEbay")
				    .usingColumns("name","title","itemId","currentPrice","listingType");
		prodRowMapper = new ProductRowMapper();
		prodRowMapperEbay=new ProductRowMapperEbay();

	}

	public int getProductCount() {
		String sql = "select count(*) from Product";
		return jdbcTemplate.queryForInt(sql);
	}

	public void insertProduct(List<Product> prod) {
		for (Product product : prod) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", product.getName());
			map.put("longDescription", product.getLongDescription());
			map.put("sku",product.getSku());
			map.put("regularPrice",product.getRegularPrice());
			//map.put("regularPrice", product.get)							
			Number newId = jdbcInsert.execute(map);
			product.setSku(newId.doubleValue());
		}
	}
	
	
	@Override
	public void insertProductEbay(List<ProductEbay> prod) {
		for (ProductEbay product : prod) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", product.getName());
			map.put("title",product.getTitle());
			map.put("itemId",product.getItemId());
			map.put("currentPrice",product.getCurrentPrice());
			map.put("listingType",product.getListingType());
			Number newId = jdbcInsertEbay.execute(map);
			
		}
		
	}

	public int findTotalOrdersByName(String prodName) {
		String sql = "select totalOrders from Product where name=?";
		return jdbcTemplate.queryForInt(sql, prodName);
	}

	public List<String> findProdsWithLessThanTotalOrder(int orderCnt) {
		String sql = "select name from Product where totalOrders<?";
		return jdbcTemplate.queryForList(sql, String.class, orderCnt);
	}

	public String findProdNameById(int id) {
		String sql = "select name from Product where id=?";
		return jdbcTemplate.queryForObject(sql, String.class, id);
	}

	public Product findProdByName(String prodName) {
		int prodsFound;
		String sql = "select * from Product where name=?";
		List<Product> prodList = jdbcTemplate.query(sql, prodRowMapper,
				prodName);

		prodsFound = prodList.size();
		if (prodsFound == 1) {

			return prodList.get(0);

		} else if (prodsFound == 0) {

			return null;

		}
		return (Product) prodList;

		// throw new
		// ProductDaoException("Multiple Products Found with Same Name");
	}

	public int updateTotalOrders(Product prod, int change) {
		String sql = "update product set totalOrders=:newTotalOrders where id=:id";
		int curTotalOrders, newTotalOrders;
		String prodName;
		MapSqlParameterSource params;
		int rowsAffected;
		double prodId = prod.getSku();

		prodName = prod.getName();
		curTotalOrders = findTotalOrdersByName(prodName);
		newTotalOrders = curTotalOrders + change;

		params = new MapSqlParameterSource("id", prodId);
		params.addValue("newTotalOrders", newTotalOrders);
		rowsAffected = namedTemplate.update(sql, params);
		return rowsAffected;
	}

	@Override
	public List getProductList(int suk) {
		String sql = "select * from Product where name=?";
		List<Product> prodList = jdbcTemplate.query(sql, prodRowMapper, suk);
		return prodList;
	}

	@Override
	public void deletePro(int suk) {
		// TODO Auto-generated method stub

	}

	@Override
	public List getProductallList() {
		String sql = "select * from Product";
		List<Product> prodList = jdbcTemplate.query(sql, prodRowMapper);
		return prodList;
	}

	
}
