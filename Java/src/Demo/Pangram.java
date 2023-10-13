package Demo;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String Sentence = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		Sentence = sc.nextLine().toLowerCase();

		String missing = "";

		for (char letter : alphabet.toCharArray()) {
			if (Sentence.indexOf(letter) == -1) {
				missing += letter;
			}
		}

		if (!missing.isEmpty()) {
			System.out.println("missing " + missing);
		} else {
			System.out.println("Pangram");
		}

	}

}
