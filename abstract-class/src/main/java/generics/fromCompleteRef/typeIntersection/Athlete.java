package generics.fromCompleteRef.typeIntersection;

public class Athlete implements Swimmer, Runner {

	@Override
	public void run() {
		System.out.println("Athlete is running");
	}

	@Override
	public void swim() {
		System.out.println("Athlete is swimming");
	}

}
