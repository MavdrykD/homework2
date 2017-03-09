package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Main {

	public static void main(String[] args) {
		String mystring = new String("2d,fg24 34 hfj,g47j 234h 38");
		char myString2 = '-';
		int maxNumber = 0;
		for (int i = 0; i < mystring.length(); i++) {
			if(mystring.codePointAt(i) < 48 || mystring.codePointAt(i) > 57){
				mystring = mystring.replace(mystring.charAt(i), myString2);
			}
		}
		String [] mass = mystring.split("-");
		for (int i = 0; i < mass.length; i++) {
			if(mass[i].length() != 0){
				if(Integer.valueOf(mass[i]) > maxNumber)
					maxNumber = Integer.valueOf(mass[i]);
			System.out.println(mass[i]);
			}
		}
		System.out.println("max number = "+maxNumber);

//		 Pattern pattern = Pattern.compile("\\d+");
//		    String word = "dfg2 34 hfjg47j 234h 38"; 
//		    Matcher matcher = pattern.matcher(word);
//		    int start = 0;
//		    while (matcher.find(start)) {
//		       String value = word.substring(matcher.start(), matcher.end());
//		       int result = Integer.parseInt(value);
//		       System.out.println(result);
//		       start = matcher.end();
//		    }
	}

}
