package exception.fromEpam;

public class WithArray {

	public static void main(String[] args) {
		int[] ar= {1, 2, 3, 4, 5, 6};
		
		try {
			int sum=0;
			for(int i=0;i<=6;i++) {
				sum+=ar[i];
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Program error: "+e.getMessage());
		}
		System.out.println("Program finish!");
	}

}
