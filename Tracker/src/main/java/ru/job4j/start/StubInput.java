package ru.job4j.start;

public class StubInput implements Input {
	
	private String[] answers;
	private int position = 0;

	public StubInput(String[] answers) {
		this.answers = answers;
	}
	
	public String ask(String question) {
        String a = "6";
		return (position < answers.length) ? answers[position++] : a;
	}

	@Override
	public int ask(String question, int[] range)   {
		int i = 0;
		try {
			for (int j : range) {
                 i = j;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter validate data again.%n");
		}
     return  i;
	}

}