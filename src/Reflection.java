/**
 * @author Paribartan
 *
 */
import java.lang.reflect.*;

public class Reflection {

	public static void main(String[] args) {
		Class c = ConcreteClass.class;
		System.out.println(c.getName());
		
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			System.out.println(ms[i].getName());
		}
	}

}
