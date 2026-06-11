package decomposition;

import java.util.Scanner;

import decomposition.action.Conversation;
import decomposition.action.PrintProductCommand;
import decomposition.action.PrintSumCommand;
import decomposition.action.RationalNumber;
import decomposition.action.RationalNumberInteractiveReader;

public class RationalNumbers {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		RationalNumber first = new RationalNumberInteractiveReader("first").read();
		RationalNumber second = new RationalNumberInteractiveReader("second").read();

		final Conversation conversation = new Conversation(new PrintSumCommand("SUM", first, second),
				new PrintProductCommand("MULT", first, second));
		conversation.run();

	}

}
