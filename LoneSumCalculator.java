package lonesum;

import java.util.ArrayList;
import java.util.List;

//Given 3 integer values, a b c, return their sum. However, 
//if one of the values is the same as another of the values, 
//the same values do not count towards the sum.

public class LoneSumCalculator {
	private List<Integer> listOfValues = new ArrayList<>();
	private int sum;

	public boolean addValue(int value) {
		if (listOfValues.size() < 3) {
			listOfValues.add(value);
			return true;
		}
		return false;
	}

	public int sumUp() {
		if (listOfValues.size() != 3) {
			return 0;
		} else {
			for (int i = 0; i < 3; i++) {
				if (countValueAppearances(listOfValues.get(i)) == 1) {
					sum = sum + listOfValues.get(i);
				}
			}
		}
		return sum;
	}

	private int countValueAppearances(int countedValue) {
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			if (countedValue == listOfValues.get(i)) {
				counter++;
				
			}
		}
		return counter;
	}
}
