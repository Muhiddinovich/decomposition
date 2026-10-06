package generics.fromEpam.wildcards;

public class Main {
	public static void main(String[] args) {
		Div<Integer> div1 = new Div<Integer>(10, 4);
		System.out.println(div1.perform());
		Div<Double> div2 = new Div<Double>(43d, 20d);
		System.out.println(div2.perform());
		System.out.println(div1.equalsDiv(div2));
	}
}
