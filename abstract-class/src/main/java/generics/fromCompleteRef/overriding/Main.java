package generics.fromCompleteRef.overriding;

public class Main {

	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
		Gen2<String> strOb2 = new Gen2<String>("Generic Test");
		var strOb3 = new Gen2<>("Hey");
		var iOb3 = new Gen2<>(956d);

		System.out.println(iOb.getOb());
		System.out.println(iOb2.getOb());
		System.out.println(strOb2.getOb());
		System.out.println(strOb3.getOb()
				.getClass()
				.getTypeName());

		System.out.println(iOb3.getOb()
				.getClass()
				.getTypeName());
	}
}
