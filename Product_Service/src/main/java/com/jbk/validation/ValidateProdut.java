package com.jbk.validation;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jbk.entity.Product;


@Component
public class ValidateProdut {
	
	

	
	
	public  Map<String, String> validateProduct(Product product){
		Map<String, String> errorMap=new HashMap<String, String>();
		
		if(product.getProductName()==null) {
			errorMap.put("Product Name", "Invalid Product Name");
		}
		
		// supplier = supplierService.getSupplierById(product.getSupplierId().getSupplierId());

//		if(supplier==null) {
//			errorMap.put("Supplier Id", "Given Supplier Not Exists");
//		}
		
		// category = categoryService.getCategoryById(product.getCategoryId().getCategoryId());
		
//		if(category==null) {
//			errorMap.put("Category Id", "Given Category Not Exists");
//		}
		
		if(product.getProductQTY()<=0) {
			errorMap.put("Product Qty", "Product Qty Should be greater than 0");
		}
		
		if(product.getProductPrice()<=0) {
			errorMap.put("Product Price", "Product Price Should be greater than 0");
		}
		
		return errorMap;
		
	}

}
