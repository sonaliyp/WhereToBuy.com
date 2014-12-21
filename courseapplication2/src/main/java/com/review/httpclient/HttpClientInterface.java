package com.review.httpclient;

import java.util.ArrayList;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.services.ProductService;

public interface HttpClientInterface {	
public ArrayList<Product> getBestBuyProductInformations(String name);

public void setProductservice(ProductService productservice);

}
