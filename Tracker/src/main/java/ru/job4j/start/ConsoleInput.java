package ru.job4j.start;

import java.util.*;

public class ConsoleInput implements Input {

	private Scanner scanner = new Scanner(System.in);


	public String ask(String question) {
		System.out.println(question);
		return scanner.nextLine();


	}

	@Override
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutException("Out of menu range");
		}
	}
}

