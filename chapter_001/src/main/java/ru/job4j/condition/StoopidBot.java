package ru.job4j.condition;

/**
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StoopidBot {


	private    String a = "Привет, Бот.";
	private    String b = "Привет, умник.";
	private   String c = "Пока.";
	private   String d = "До скорой встречи.";
	private    String e = "Сколько будет 2 + 2?";
	private   String h = "Это ставит меня в тупик. Спросите другой вопрос.";


	
	public String answer(String question) {
		String g = null;
		if (question.equals(a)) {
			g = b;
		}
		if  (question.equals(c)) {
			g = d;
		}
		if (question.equals(e)) {
			g = h;
		}
		return g;

	}


}
