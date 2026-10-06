package generics.fromEpam.wildcards;

public class Check1 {
	public static void main(String[] args) {
		Check<Double> check = new Check<>();
		Check<? super Integer> check2 = new Check<>();
	}
}