package foreachmethods;
import java.util.List;
import java.util.Arrays;
public class foreach {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(23,45,56,67,78,88);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.err.println("   ");
        for(int i:list){
            System.out.println(i);
        }
        
    }
    
}
