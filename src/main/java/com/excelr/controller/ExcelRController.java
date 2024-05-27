package com.excelr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Login;
import com.excelr.model.Product;

@RestController
@CrossOrigin("*")
public class ExcelRController {
     
	@GetMapping("/allProducts")
	public List<Product> getAllProducts(){
		Product  product1=new Product("https://jfsexcelr.s3.ap-south-1.amazonaws.com/laptop1.jpeg","Dell",50000);
		Product  product2=new Product("https://jfsexcelr.s3.ap-south-1.amazonaws.com/laptop2.jpeg","Hp",40000);
		Product  product3=new Product("https://jfsexcelr.s3.ap-south-1.amazonaws.com/laptop3.jpeg","Acer",30000);
		Product  product4=new Product("https://jfsexcelr.s3.ap-south-1.amazonaws.com/laptop4.jpeg","Lenovo",20000);
		Product  product5=new Product("https://jfsexcelr.s3.ap-south-1.amazonaws.com/laptop5.jpeg","Mac",100000);
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		
		return list;
	}

	@PostMapping("/login")
public String login(@RequestBody Login login) {
	String res=null;
	if((login.uname).equals("ExcelR") && (login.upwd).equals("ExcelR@123")) {
		res="Login Success";
	}else {
		res="Login Fail";
	}
	return res;
}


}
