package test.com.review.httpclient;





import org.junit.Test;

import com.review.httpclient.BestBuyHttpClient;


public class BestBuyHttpClient_Test {
	 @Test
     public void testStock() { 
             
		 BestBuyHttpClient bbhttpClient = new BestBuyHttpClient();
		 bbhttpClient.getBestBuyProductInformations("cable");
		// bbhttpClient.getBestBuyProductReviewBySKU(1780275l, "10", "20");
     } 

}
