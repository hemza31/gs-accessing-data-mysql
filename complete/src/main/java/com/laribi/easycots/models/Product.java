package com.laribi.easycots.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;

	private String productName;

	private String projectLeader;

	private Date productCreatedOn	;

	private String productUrl;

	public Product(Integer productId, String productName, String projectLeader, Date productCreatedOn, String productUrl) {
		this.productId = productId;
		this.productName = productName;
		this.projectLeader = projectLeader;
		this.productCreatedOn = productCreatedOn;
		this.productUrl = productUrl;
	}

	public Product() {
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProjectLeader() {
		return projectLeader;
	}

	public void setProjectLeader(String projectLeader) {
		this.projectLeader = projectLeader;
	}

	public Date getProductCreatedOn() {
		return productCreatedOn;
	}

	public void setProductCreatedOn(Date productCreatedOn) {
		this.productCreatedOn = productCreatedOn;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", projectLeader='" + projectLeader + '\'' +
				", productCreatedOn=" + productCreatedOn +
				", productUrl='" + productUrl + '\'' +
				'}';
	}
}
