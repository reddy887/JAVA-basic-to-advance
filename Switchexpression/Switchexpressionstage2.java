package Switchexpression;

public class Switchexpressionstage2 {
    public static void main(String args[]){
        int num=3;
        String result=" ";
        result=switch(Integer.compare(num,0)){
            case 1 -> result="positive";
            case 0 -> result="zero";
            case -1 -> result="negative";
            default -> "invalid";

        };
        System.out.printf("the given number %d is %s",num,result );

    }
    
}
