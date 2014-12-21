package edu.npu.courseapp.domain;



import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author soumyaacharya
 * 
 */
@XmlRootElement(name = "product")
@XmlType(propOrder = { "sku", "name", "longDescription","regularPrice" })
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3723910394542506470L;
	private String name;
	private String longDescription;
	private double sku;
	private String regularPrice;

	public Product(){
		//default constructor
	}
	
	public Product(String name, String longDescription, double sku, String regularPrice) {
		this.name = name;
		this.longDescription = longDescription;
		this.sku = sku;
		this.regularPrice=regularPrice;
	}

	public String getName() {
		return name;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public double getSku() {
		return sku;
	}
	
	public String getRegularPrice() {
		return regularPrice;
	}
	
	

	@XmlElement(name = "name")
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "longDescription")
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@XmlElement(name = "sku")
	public void setSku(double sku2) {
		this.sku = sku2;
	}
	
	@XmlElement(name = "regularPrice")
	public void setRegularPrice(String regularPrice){
		this.regularPrice=regularPrice;
		
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (sku ^ (sku >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (sku != other.sku)
			return false;
		return true;
	}*/
	
	public void printProduct(){
		System.out.println("Name:"+name);
		System.out.println("SKU:"+sku);
		System.out.println("Long Description:"+longDescription);
		System.out.println("Regular Price:"+regularPrice);
		System.out.println(" ===========================================================");
		
	}
}
