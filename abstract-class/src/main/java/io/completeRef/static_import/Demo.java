package io.completeRef.static_import;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class Demo {

	public static void main(String[] args) {
		double side1 = 3;
		double side2 = 4;

		out.println("Hypotenuse: " + sqrt(pow(side1, 2) + pow(side2, 2)));

	}

}
