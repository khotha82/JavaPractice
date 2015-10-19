package com.example.unittest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna_hotha on 4/15/15.
 */
public class ScorableCollection {

	public List<Scorable> scorableList = new ArrayList<>();

	public void add(Scorable scorable) {
		scorableList.add(scorable);
	}

	public int getAverage() {

		int sum = scorableList.stream().mapToInt(Scorable::getScore).sum();

		return sum / scorableList.size();
	}
}
