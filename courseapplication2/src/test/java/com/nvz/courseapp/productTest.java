package com.nvz.courseapp;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import edu.npu.courseapp.dao.ProductDAO;
@ContextConfiguration("classpath:test-app-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class productTest {

	@Test
	public void getList(){
		
	}
	@Autowired
	@Qualifier("ProductDaoJdbc")
	private ProductDAO ProductDAO;

	@Test
	public void testOrderCount() {
		int suk =1;
		List cnt = ProductDAO.getProductList(suk);
	//	System.out.println(cnt);
		System.out.println("test");
	}

	//@Test
/*	public void testFindAllEquipment() {
		List<Equipment> eq = equipmentDAO.findAllEquipment();// .findAllOrders();
		int orderCnt = equipmentDAO.getEquipmentCount();
		assertTrue(eq.size() == orderCnt);
		System.out.println(eq);
	}
	//@Test
	public void testDeleteRecord(){
		equipmentDAO.deleteEquipment(101);
	System.out.println("test");
	}
	//@Test 
	public void testToInsert(){
		int a =equipmentDAO.InsertEquipment(102,"Fitness Gear","300 lb Olympic Weight Set");
	
		if(a==1){
			System.out.println("successful inserted ");
		}
		else{
			System.out.println("Fail");
		}
	}
	//@Test 
	public void testToupdate(){
     int a =	equipmentDAO.updateEquipment(102, "name", "details");
		
		System.out.println("record update ");
		if(a==1){
			System.out.println("successful inserted ");
		}
		else{
			System.out.println("Fail");
		}
	}
	@Test
	public void add(){
		Equipment eq = new Equipment(199,"eq2","fhj fkfllf");
		equipmentDAO.insertEQ(eq);
		System.out.println("inserted ");
	}

}*/
}
