package sb;

public class Main {
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		builder.ensureCapacity(100);
		System.out.println(builder.capacity());
		builder.append("Hello");
		builder.setLength(10);
		builder.insert(4, "OK");
		System.out.println(builder);
		builder.delete(4, 6);
		System.out.println(builder);
		
		String word=new String(builder);
		System.out.println(word);
		String empString=null;
		
	}
}
