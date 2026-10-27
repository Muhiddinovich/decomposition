package io.completeRef.assert_demo;

public class Demo {

    public static void main(String[] args) {
	int i = 11;
	try {
	    for (int j = 0; j < 15; j++) {
		System.out.println("Good boi: " + i);
		i--;
		assert i > 0 : "Bad boi";
	    }
	} catch (AssertionError e) {
	    System.err.println(e);
	}

	// make sure -ea is added in VM arguments to enable assertions
    }

}
