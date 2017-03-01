package homework1;

public class Main {

	public static void main(String[] args) {
		Rectagle rec1 = new Rectagle();
		System.out.println("Площа прямокутника (зі сторонами а-"+rec1.hightOfRectagle+", b-"+rec1.widthOfRectagle+") = "+rec1.area());
		System.out.println("Периметр прямокутника (зі сторонами а-"+rec1.hightOfRectagle+", b-"+rec1.widthOfRectagle+") = "+rec1.perimeter());
		
		Rectagle rec2 = new Rectagle(7, 2);
		System.out.println("Площа прямокутника (зі сторонами а-"+rec2.hightOfRectagle+", b-"+rec2.widthOfRectagle+") = "+rec2.area());
		System.out.println("Периметр прямокутника (зі сторонами а-"+rec2.hightOfRectagle+", b-"+rec2.widthOfRectagle+") = "+rec2.perimeter());
//		System.out.println(rec1.toString());
	

	}

}
