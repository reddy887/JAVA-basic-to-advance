package BASICS;
import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
        int array[]={1,2,3,4,5,6,7,8,9,99};
        System.out.println("enter the search element");
        int search=sc.nextInt();
        int index=linear(array, search);
        if(index==-1){
            System.out.println("the element not found");
        }else {
            System.out.println("the element founded"+" " +index);
        }
        sc.close();
    }
    public static int linear(int[] array,int search){
        for(int i=0;i<array.length;i++){
            if(array[i]==search){
                return i;
            }
        
        }
        return -1;

    }
}