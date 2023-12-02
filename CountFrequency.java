package zsgs;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public static Map<String, Integer> countWords(String str, int i, Map<String, Integer> map) {
		String words = "";
		int count = 1;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == ' ') {
				if (str.equals(words)) {
					count++;
				}
				words = "";

			} else {
				words += str.charAt(j);
			}

		}
		map.put(str, count);
		return map;
	}

	public static void main(String[] args) {
		String str = "Write a java program that reads a text from the user and counts the frequency of each word in the text";
		Map<String, Integer> map = new HashMap<>();
		String words = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				map = countWords(words, i, map);
			} else {
				words += str.charAt(i);
			}

		}
		System.out.println(map);

	}

}
