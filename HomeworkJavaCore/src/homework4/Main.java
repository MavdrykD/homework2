package homework4;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat(true);
		for (int i = 0; i < args.length; i++) {
			cat.getClass().getMethods();
			System.out.println();
		}
		allMethods(cat.getClass());
		System.out.println("-------------------");
		parentClass(cat.getClass());
		System.out.println("-------------------");
		
		Jaguar jaguar = new Jaguar(true);
		for (int i = 0; i < args.length; i++) {
			jaguar.getClass().getMethods();
			System.out.println();
		}
		allMethods(jaguar.getClass());
		System.out.println("-------------------");
		parentClass(jaguar.getClass());
		
	}
	
	public static  void parentClass  (Class cl) {
		
		Class parent = cl.getSuperclass();
		System.out.println("All parent classes:" );
		do {
			System.out.println(parent.getSimpleName());
			parent = parent.getSuperclass();
		} while (parent != Object.class);
		System.out.println(parent.getSimpleName());
	}
	
	public static void allMethods  (Class cl) {
		
		for(Method method : cl.getMethods()){
			System.out.println("method: " + method.getName());
		}
	}

}
