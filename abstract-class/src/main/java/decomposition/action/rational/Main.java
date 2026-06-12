package decomposition.action.rational;

import java.util.Scanner;

import decomposition.action.conversation.Conversation;
import decomposition.action.conversation.command.PrintProductCommand;
import decomposition.action.conversation.command.PrintQuotientComman;
import decomposition.action.conversation.command.PrintSumCommand;

public class Main {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		RationalNumber first = new RationalNumberInteractiveReader("first").read();
		RationalNumber second = new RationalNumberInteractiveReader("second").read();

		final Conversation conversation = new Conversation(
				new PrintSumCommand("SUM", first, second),
				new PrintProductCommand("MULT", first, second), 
				new PrintQuotientComman("DIV", first, second));
		conversation.run();

	}

}
