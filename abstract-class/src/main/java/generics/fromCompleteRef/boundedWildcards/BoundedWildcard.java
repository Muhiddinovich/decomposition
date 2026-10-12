package generics.fromCompleteRef.boundedWildcards;

public class BoundedWildcard {

	static void showXY(Coordinates<?> c) {
		System.out.println("X Y Coordinates: ");
		for (int i = 0; i < c.coordinates.length; i++) {
			System.out.println(c.coordinates[i].x + " " + c.coordinates[i].y);
		}
	}

	static void showXYZ(Coordinates<? extends ThreeD> c) {
		System.out.println("X Y Z coordinates: ");
		for (int i = 0; i < c.coordinates.length; i++) {
			System.out
					.println(c.coordinates[i].x + " " + c.coordinates[i].y + " "
							+ c.coordinates[i].z);
		}
	}

	static void showXYZT(Coordinates<? extends FourD> c) {
		System.out.println("X Y Z T coordinates: ");
		for (int i = 0; i < c.coordinates.length; i++) {
			System.out.println(c.coordinates[i].x + " " + c.coordinates[i].y
					+ " " + c.coordinates[i].z + " " + c.coordinates[i].t);
		}
	}

	public static void main(String[] args) {
		TwoD[] td = {
				new TwoD(0, 0),
				new TwoD(7, 9),
				new TwoD(18, 4),
				new TwoD(-1, -23)
		};

		Coordinates<TwoD> tdlocs = new Coordinates<>(td);
		showXY(tdlocs);

		FourD[] fourDs = {
				new FourD(1, 2, 3, 4),
				new FourD(6, 8, 14, 8),
				new FourD(22, 9, 4, 9),
				new FourD(3, -2, -23, 17)
		};

		Coordinates<FourD> fdlocs = new Coordinates<>(fourDs);
		showXY(fdlocs);
		showXYZ(fdlocs);
		showXYZT(fdlocs);

	}
}
