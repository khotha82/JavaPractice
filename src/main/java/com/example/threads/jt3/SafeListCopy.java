package com.example.threads.jt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by krishna_hotha on 8/24/15 2015.
 */
public class SafeListCopy {

	public static void print(String[] words) {

		for (String word : words) {

			System.out.println(word);
		}
	}

	public static void main(String[] args) {

		List<String> wordList = Collections.synchronizedList(new ArrayList<String>());
		wordList.add("synchronization");
		wordList.add("is");
		wordList.add("important");

		String[] list = wordList.toArray(new String[0]);
		print(list);
	}

}
