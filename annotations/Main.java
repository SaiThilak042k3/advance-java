import java.lang.annotation.*;
import java.lang.reflect.Method;

import annotations.*;

public class Main{
	
	public String execute() throws Throwable {
		Class<CustomController> controller = CustomController.class;
		//Annotation[] annotations = controller.getDeclaredAnnotations();
		//boolean restController = controller.isAnnotationPresent(RestController.Class);
		RestController restController = controller.getAnnotation(RestController.class);
		if (restController != null){
			Method[] methods = controller.getMethods();
			for(Method method : methods) {
				//boolean requestMapping = method.isAnnotationPresent(ResquestMapping.Class)
				RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
				if (requestMapping.invoke()){
					if(requestMapping != null) {
						method.invoke(controller.newInstance());
					}
				}
			}

		}
		
		return null;
	}

	public static void main(String... args){
		try{
		new Main().execute();
		} catch (Throwable e){

		}

		
	}
}