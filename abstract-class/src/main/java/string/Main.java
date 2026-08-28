package string;

public class Main {

	public static void main(String[] args) {
		String nameString = "Fred";
//		System.out.println(String.format("Hello %s !!!", nameString));
		char[] hey = new char[5];
		nameString.getChars(1, 4, hey, 2);
		System.out.println(hey);
		System.out.println(nameString.indexOf('d'));
		System.out.println(nameString.length());
		System.out.println(hey.length);
//		System.out.println(nameString.repeat(55));

		System.out.println(nameString.replaceAll("Fr", "Gre"));
		String [] words=new String[10];
		words="Hello My name is Fred".split(" ");
		for(String s:words) {
			System.out.println(s);
		}
		System.out.println(nameString.startsWith("Fr"));
		System.out.println(words[0].substring(2));
		System.out.println(words[4].regionMatches(0, nameString, 0, 3));
	}

}
