package Sample;

public class Main {
	public static void main(String[] args) {
		BaseService service = new LowestService();
		service.serve();
	}
}
