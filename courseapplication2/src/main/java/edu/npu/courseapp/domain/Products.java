package edu.npu.courseapp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class Products implements Serializable{
	/**
	 * 
	 */
	
	public Products(){
		//default constructor
	}
	private static final long serialVersionUID = 1L;
	int currentPage;
	int totalPages;
	int from;
	int to;
	int total;
	String queryTime;
	String totalTime;
	String canonicalUrl;
	boolean partial = false;
	public Collection<Product> productList = new ArrayList<Product>();
	

	@XmlAttribute(name = "currentPage")
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	@XmlAttribute(name = "totalPages")
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	@XmlAttribute(name = "from")
	public void setFrom(int from) {
		this.from = from;
	}
	@XmlAttribute(name = "to")
	public void setTo(int to) {
		this.to = to;
	}
	@XmlAttribute(name = "total")
	public void setTotal(int total) {
		this.total = total;
	}
	@XmlAttribute(name = "queryTime")
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}
	@XmlAttribute(name = "totalTime")
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	@XmlAttribute(name = "canonicalUrl")
	public void setCanonicalUrl(String canonicalUrl) {
		this.canonicalUrl = canonicalUrl;
	}
	@XmlAttribute(name = "partial")
	public void setPartial(boolean partial) {
		this.partial = partial;
	}
    @XmlElementRef
	public void setProduct(Collection<Product> product) {
		this.productList = product;
	}
    
    

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	public int getTotal() {
		return total;
	}

	public String getQueryTime() {
		return queryTime;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public String getCanonicalUrl() {
		return canonicalUrl;
	}

	public boolean isPartial() {
		return partial;
	}
    
	public Collection<Product> getProduct() {
		return productList;
	}
	
	

}
