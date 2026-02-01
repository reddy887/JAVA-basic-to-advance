package methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// import java.util.function.Consumer;

public class methodreferencepractice {
    public void greet(String names){
        System.out.println("hey! hi how are you  "+names);

    }

    public static void main(String[] args) {
        List<String>names=Arrays.asList("reddy","babu","hari");
        Collections.sort(names,(s1,s2)->s1.compareTo(s2));
        names.forEach(System.out::println);
        // names.forEach(name->greet(name)

        //reference to an instance method of a particular object
        methodreferencepractice mrf=new methodreferencepractice();
        names.forEach(mrf::greet);
        // names.forEach(methodreferencepractice::greet);
        
        // for(int i=0;i<names.size();i++){
        //     System.out.println(names.get(i));

        // }
        // for(String i:names){
        //     System.out.println(i);

        // }
        // Consumer<String> con=new Consumer<String>(){
        //     public void accept(String i){
        //         System.out.println(i);
        //     }
        // };
        // names.forEach(con);  
    }
    
}
