import annotations.*;

import java.lang.sort.*;

@RestController(number = 10)
@sort(strategy = TYPE.MERGE)
public class CustomController {

	@sort
	public String sorting() (invoke = true){
	 double output = sorter.Sort(list, new MergeSort());
    	 for(int i =0 ; i < output.length ; i++ ){
         System.out.println(output[i]);
       }
	
		
}
    	
	@RequestMapping
	public String method() {
		System.out.println("Sairam0");
		return "Sairam";
	}

	@RequestMapping 
	public String method1() {
		System.out.println("Sairam1");
		return "Sairam";
	}

	@RequestMapping
	public String method2() {
		System.out.println("Sairam2");
		return "Sairam";
	}

	@RequestMapping 
	public String method3() {
		System.out.println("Sairam3");
		return "Sairam";
	}

}
