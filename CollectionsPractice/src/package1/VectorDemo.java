package package1;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		
		v.addElement(123);
		v.add("satish");
		v.addElement("apple");
		
		System.out.println(v);
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		System.out.println(en.nextElement());

	}

}
