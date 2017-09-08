package baseball;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Baseball {
	ArrayList<Integer> generateComputerBalls() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Collections.shuffle(numbers);

		ArrayList<Integer> balls = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			balls.add(numbers.get(i));
		}
		return balls;
	}

	// 0 - nothing, 1 - ball, 2 - strike
	int calculateBall(ArrayList<Integer> ComputerBalls, int userBall, int position) {
		if (!ComputerBalls.contains(userBall)) {
			return 0;

		}
		if(ComputerBalls.get(position) == userBall) {
			return 2;
		}

		return 1;
	}

	public static void main(String[] args) {
		
	}

}
