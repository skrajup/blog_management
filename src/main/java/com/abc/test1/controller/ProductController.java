package com.abc.test1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abc.test1.model.ProductModel;

@Controller
public class ProductController {
	
	private static List<ProductModel> productList;
	
	static {productList = new ArrayList<ProductModel>();}
	
	@GetMapping("/")
	public String homepage() {
		return "homepageview";
	}
	
	@GetMapping("/products/add")
	public String addProductForm(Model m) {
		ProductModel product = new ProductModel();
		m.addAttribute("product", product);
		
		return "addproductformview";
	}
	
	@PostMapping("/products/add")
	public String addProductToCart(ProductModel product, Model m) {
		productList.add(product);
		
		m.addAttribute("message", "product added to cart successfully.");
		return "addproductsuccessview";
	}
	
	@GetMapping("/products/cart")
	public String productCart(Model m) {
		m.addAttribute("productList", productList);
		return "productscartview";
	}
}
