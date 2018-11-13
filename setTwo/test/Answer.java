package test;

import java.util.ArrayList;
import java.util.List;

public class Answer {

	public static void main(String[] args) {
		int i = answer("abccbaabccba");
		System.out.println(i);
	}

	public static int answer(String s) {

		List<Character> charList = new ArrayList<>();

		StringBuffer strbfr = new StringBuffer();
		StringBuffer strbfr2 = new StringBuffer();

		boolean boo = false;
		int value = 0;

		char[] charOfString = s.toCharArray();
		for (char c : charOfString) {
			charList.add(c);
		}

		for (int i = 0; i < charList.size(); i++) {
			strbfr.append(charList.get(i));

			for (; strbfr2.length() < charList.size();) {
				strbfr2.append(strbfr);
			}


			if (s.equals(strbfr2.toString())) {
				boo = true;
			} else {
				boo = false;
			}

			if (boo) {
				value = (int) s.length() / strbfr.length();
				break;
			} else {
				value = 0;

			}

			strbfr2.setLength(0);
		}

		return value;

	}

}
