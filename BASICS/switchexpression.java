package BASICS;

public class switchexpression {
    public static void main(String args[]){
        int num=243450;
        switch(Integer.compare(num, 0)){
            case 1-> System.out.println("positive");
            case -1-> System.out.println("negative");
            case 0 -> System.out.println("zero");

        }
    }
    
}
