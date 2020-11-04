package application;

import java.util.ArrayList;
import java.util.Collections;

public class Application {

	public static void main(String[] arguments) {

		int size = 100;
		
		if(!"".equals(arguments[0])) {
			size = Integer.parseInt(arguments[0]);
		}
		
		ArrayList<Double> numbers = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			numbers.add(Math.random());
		}
		
		Collections.sort(numbers);
		
		System.out.println(numbers);
	}

}
