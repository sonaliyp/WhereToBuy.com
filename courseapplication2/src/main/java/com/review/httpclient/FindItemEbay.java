package com.review.httpclient;




import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




import com.ebay.services.client.ClientConfig;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsByKeywordsRequest;
import com.ebay.services.finding.FindItemsByKeywordsResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.SearchItem;

import edu.npu.courseapp.domain.Product;
import edu.npu.courseapp.domain.ProductEbay;
import edu.npu.courseapp.services.ProductService;


public class FindItemEbay  {
	public  ArrayList<ProductEbay> productEbayList = new ArrayList<ProductEbay>();
	private final static  ClientConfig config;
	private ProductService productservice;
	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	static{
    	// initialize service end-point configuration
    	config = new ClientConfig();
    	config.setApplicationId("HagosSal-3ff7-4471-a67c-26e5402505f1");
	}
   
	public ArrayList<ProductEbay> callEbayAPI(String KeyWord) throws Exception {
        try {

        	
        	//ArrayList<Product> products = new ArrayList<Product>();
        	//create a service client
            FindingServicePortType serviceClient = FindingServiceClientFactory.getServiceClient(config);
            
            //create request object
            FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();
            //set request parameters
            request.setKeywords(KeyWord);
            PaginationInput pi = new PaginationInput();
            pi.setEntriesPerPage(3);
            request.setPaginationInput(pi);
            
            //call service
            FindItemsByKeywordsResponse result = serviceClient.findItemsByKeywords(request);
            
            //output result
            System.out.println("---------------------------------------------------------\n");
            System.out.println("Find " + result.getSearchResult().getCount() + " items." );
            System.out.println("---------------------------------------------------------\n");
            List<SearchItem> items = result.getSearchResult().getItem();
            for(SearchItem item : items) {
            	ProductEbay product = new ProductEbay();
            	product.setTitle(item.getTitle());
            	product.setItemId(item.getItemId());
            	product.setPrice(String.valueOf(item.getSellingStatus().getCurrentPrice().getValue()));
            	product.setListingType(item.getListingInfo().getListingType());
            	product.setName(KeyWord);
            	productEbayList.add(product);
            }
            System.out.println("---------------------------------------------------------\n");
            
            productservice.insertProductEbay(productEbayList);
            
            
            Iterator<ProductEbay> it = productEbayList.iterator();
			
			while(it.hasNext()){
				ProductEbay newProd = (ProductEbay)it.next();
				if(newProd != null){
					System.out.println(newProd.getName());
					System.out.println(newProd.getTitle());
					System.out.println(newProd.getItemId());
					System.out.println(newProd.getCurrentPrice());
					System.out.println(newProd.getListingType());
					
				}
			}
            
        } catch (Exception ex) {
        	// handle exception if any
            ex.printStackTrace();
        }
        return productEbayList;
    }
	
}

