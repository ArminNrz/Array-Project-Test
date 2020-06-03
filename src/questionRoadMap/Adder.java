package questionRoadMap;

import question.Question;

public class Adder implements Question{
    private Double[] aray = new Double[100];
    
    @Override
    public void main(){
    	method();
        for (Double value : aray) {
            System.out.println(String.format("%.1f", value) + ", ");
        }
    }
    
    public Double[] method() {
        Double firstNumber = 1.0;
        aray[0] = firstNumber;
        for (int i = 1; i < aray.length; i++) {
            Double lastNumber = aray[i-1];
            Double nextNumber = lastNumber + 0.1;
            aray[i] = nextNumber;
        }
        return aray;
    }
}
