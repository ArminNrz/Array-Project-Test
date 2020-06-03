package questionRoadMap;

import question.Question;

public class SevenThree implements Question {
    private int[] integerList = new int[100];
    
    @Override
    public void main(){
    	method();
        for (int i = 0; i < integerList.length; i++) {
            System.out.print(integerList[i] + ", ");
        }
    }
    
    public int[] method() {
        for (int i = 0; i < integerList.length; i++) {
            if(i % 2 == 0){
                integerList[i] = 7;
            }
            else{
                integerList[i] = 3;
            }
        }
        return integerList;
    }
}
