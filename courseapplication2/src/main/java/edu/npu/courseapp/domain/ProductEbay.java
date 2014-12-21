package edu.npu.courseapp.domain;

//package com.review.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ebay.services.finding.Amount;

/**
 * 
 * @author priyankaacharya
 * 
 */
@XmlRootElement(name = "item")
@XmlType(propOrder = { "title", "itemId","currentPrice","listingType" })
public class ProductEbay implements Serializable {
private static final long serialVersionUID = -3723910394542506470L;
	private String name;
	private String title;
	private String itemId;
	private String currentPrice;
	private String listingType;

	public ProductEbay(){
		//default constructor
	}
	
	public ProductEbay(String name, String title, String itemid,String listingType,String price) {
		this.name = name;
		this.title = title;
		this.itemId = itemid;
		this.currentPrice = price;
		this.listingType = listingType;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}
	public String getListingType() {
		return listingType;
	}
	public String getItemId() {
		return itemId;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	@XmlElement(name = "itemId")
	public void setItemId(String itemid) {
		this.itemId = itemid;
	}
	
	@XmlElement(name = "currentPrice")
	public void setPrice(String d) {
		this.currentPrice = d;
	}
	
	@XmlElement(name = "listingType")
	public void setListingType(String type) {
		this.listingType = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((currentPrice == null) ? 0 : currentPrice.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result
				+ ((listingType == null) ? 0 : listingType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		ProductEbay other = (ProductEbay) obj;
		if (currentPrice == null) {
			if (other.currentPrice != null)
				return false;
		} else if (!currentPrice.equals(other.currentPrice))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (listingType == null) {
			if (other.listingType != null)
				return false;
		} else if (!listingType.equals(other.listingType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


}