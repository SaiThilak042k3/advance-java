import annotations.*;

@RestController(number = 10)
public class CustomController {

	@RequestMapping
	public String method() {
		System.out.println("Sairam0");
		return "Sairam";
	}

	@RequestMapping (invoke = true)
	public String method1() {
		System.out.println("Sairam1");
		return "Sairam";
	}

	@RequestMapping
	public String method2() {
		System.out.println("Sairam2");
		return "Sairam";
	}

	@RequestMapping (invoke = true)
	public String method3() {
		System.out.println("Sairam3");
		return "Sairam";
	}

}