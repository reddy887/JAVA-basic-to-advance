package foreachmethods;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class foreachmethod {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(23,45,56,67,78,88);
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }
        // System.err.println("   ");
        // for(int i:list){
        //     System.out.println(i);
        // }


        //annonymous classes
        // Consumer<Integer> con=new Consumer<Integer>() {
        //     public void accept(Integer i){
        //         System.out.println(i);

        //     }
        // };

        //lambda expression using consumer functional interface
        // Consumer<Integer> con=i-> System.out.println(i);
        // list.forEach(con);   
        // list.forEach(i->System.out.println(i));    
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Reddy");
        map.put(2,"Kalyan");
        map.put(3,"Sandeep");
        // BiConsumer<Integer,String>bicon=(ke,value)->System.out.println(ke+":"+value);
        // map.forEach(bicon);
        map.forEach((ke,value)->System.out.println(ke+":"+value));
            
        };
    
}
