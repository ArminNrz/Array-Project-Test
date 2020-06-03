package main;

import flyWeight.FlyWeightPattern;
import question.Question;

public class Main {

	public static void main(String[] args) {
		
		/* you can chose 1-2-3 for they key
		 * if you chose 1 question number one is active
		 * if you chose 2 question number two is active
		 * if you chose 3 question number three is active 
		 * I use flyWeight pattern*/
		Question question = FlyWeightPattern.getQuestion(3); // 1-2-3
		question.main();
	}

}
