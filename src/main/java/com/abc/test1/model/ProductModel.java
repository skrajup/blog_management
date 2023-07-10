package com.abc.test1.model;

public class ProductModel {
	private String productName;
	private int productCost;
	private String imageUrl;
	private String productDescription;
	
	public ProductModel() {
		super();
	}
	public ProductModel(String productName, int productCost, String imageUrl, String productDescription) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.imageUrl = imageUrl;
		this.productDescription = productDescription;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
