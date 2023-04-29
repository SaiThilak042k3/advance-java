package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.lang.*;

@RestController
public class DemoController {
	@GetMapping("/")
	public String index() {
		return "root page";
	}
	
	public String convertCase(String word, String to) {
		String changed = "";
		int ascci;
		int wordascci;
		int size = word.length();
		
		
		if(to.equals("upper")) {
			for (int i = 0; i < size; i++) {
			
				wordascci= (int)word.charAt(i);
				if(wordascci >=65 && wordascci <= 90){
					changed += word.charAt(i);
				}else{
					ascci = word.charAt(i) - 32;
					changed += (char)ascci ;
				}
				
			}
			  
		}else if(to.equals("lower")) {
			for (int i = 0; i < size; i++) {
				wordascci= (int)word.charAt(i);
				if(wordascci >= 97 && wordascci <= 122){
					changed += word.charAt(i);
				}else{
				ascci = word.charAt(i) + 32;
					changed += (char)ascci ;
				}
			}
			  
		}else{
			changed = "sorry";
		}
		
		
		
		return changed;
	}
	
	public String asscciPrint(String word){
		String changed = "";
		int ascci;
		int wordascci;
		int size = word.length();
		
		
		
			for (int i = 0; i < size; i++) {
			
				wordascci= (int)word.charAt(i);
				
				changed += wordascci + " ";
				
			}
		
		
		
		return changed;
	}
	
	
	@PostMapping("/resource")
	public String index2(@RequestBody Map<String,Object> arr) {
	
		String sa = (String)arr.get("data");
		ArrayList<String> options =  (ArrayList<String>)arr.get("options");
		String result = "";
		//String sb = arr.get("b");
		
		String aword = options.get(0);
		
		
		if(aword.equals("-c")){
		String bword = options.get(1);
			 result = convertCase(sa,bword);
		}else if(aword.equals("-a")){
			 result = asscciPrint(sa);
		}else{
			 result = "worng request";
		}
		
		
		//String result[0] = options[0];
		return result;
	}
}
