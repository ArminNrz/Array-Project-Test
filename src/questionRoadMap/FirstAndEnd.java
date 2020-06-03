package questionRoadMap;

import question.Question;

public class FirstAndEnd implements Question {
	   private int[] aray = new int[100];
	   
	   @Override
	   public void main(){
		   method();
	       for (int i : aray) {
	           System.out.print(i + ", ");
	       }
	   }
	   
	   public int[] method() {
	       int renumber = 100;
	       int number = 1;
	       for (int i = 0; i < aray.length; i++) {
	            if(i % 2 == 0){
	               aray[i] = number;
	               number++;
	            }
	            else{
	               aray[i] = renumber;
	               renumber--;
	            }
	       }
	       return aray;
	   }
}
