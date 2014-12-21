package com.review.httpclient;



import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.Products;
import edu.npu.courseapp.services.ProductService;
import edu.npu.courseapp.services.ProductServiceImpl;




public class BestBuyHttpClient implements HttpClientInterface{
	private ProductService productservice;
	public ProductService getProductservice() {
		return productservice;
	}
	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}
	/**
	 * Retrieve all the product information from best buy...
	 * 
	 * @return null
	 */
	public ArrayList<Product> getBestBuyProductInformations(String name) {
		ArrayList<Product> bbProduct=new ArrayList<Product>();
		try {

			URL url = new URL(
					"http://api.remix.bestbuy.com/v1/products(description="+name+"*)?show=sku,name,longDescription,regularPrice&format=xml&apiKey=fchr2wshgq94vm8wgyemg8sa");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/xml");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			try {

				JAXBContext jaxbContext = JAXBContext
						.newInstance(Products.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext
						.createUnmarshaller();
				Products products = (Products) jaxbUnmarshaller
						.unmarshal(new InputStreamReader(
								(conn.getInputStream())));
				bbProduct=(ArrayList<Product>) products.getProduct();
					productservice.insertProduct(((ArrayList<Product>) products.getProduct()));
				
				
				
				// connect to db and store thealue[i]. data
				//com.review.dao.mongo.MongoDAOProcessHelper daoHelper = new com.review.dao.mongo.MongoDAOProcessHelper();
				//daoHelper.processBestBuyData((List<Product>) products
				//		.getProduct());

			} catch (JAXBException e) {
				e.printStackTrace();
			}
			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return bbProduct;

	}

	


}
