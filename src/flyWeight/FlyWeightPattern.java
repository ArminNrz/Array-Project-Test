package flyWeight;

import java.util.HashMap;

import question.Question;
import questionRoadMap.Adder;
import questionRoadMap.FirstAndEnd;
import questionRoadMap.SevenThree;

public class FlyWeightPattern {
	private static HashMap<Integer, Question> hm = new HashMap<Integer, Question>();
	
	public static Question getQuestion(int key) {
		Question question = null;
		
		if(hm.containsKey(key)) {
			question = hm.get(key);
		}else {
			switch(key)
			{
				case 1:
					System.out.println("Question Number one:");
					question = new SevenThree();
					break;
				case 2:
					System.out.println("Question Number two:");
					question = new Adder();
					break;
				case 3:
					System.out.println("Question Number three: ");
					question = new FirstAndEnd();
					break;
				default:
					System.out.println("Unreachable Question");
			}
			hm.put(key, question);
		}
		
		return question;
	}
}
