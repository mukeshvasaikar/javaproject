
package collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println(v.size());

		v.addElement("Gauri");
		v.addElement(null);
		v.addElement("Aashish");
		v.addElement("Priya");
		v.addElement("Sandip");
		v.addElement("Gorakh");

		System.out.println(v);

		System.out.println(v.size());

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		v.removeElement(null);

		System.out.println(v);
	}

}
