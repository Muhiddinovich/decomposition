package generics.fromCompleteRef.typeIntersection;

public class Demo {

	public static <T extends Swimmer & Runner> void train(T sportsman) {
		sportsman.swim();
		sportsman.run();
	}
	public static void main(String[] args) {
		Athlete athlete = new Athlete();
		train(athlete);
	}

}
