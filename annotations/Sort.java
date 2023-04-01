package annotations;


import java.lang.annotation.*;
import java.lang.sort.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface sort{

	List<Integer> list = {1, 5, 2,3, 9, 0};
}
