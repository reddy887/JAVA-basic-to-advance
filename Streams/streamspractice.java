package Streams;

import java.util.List;
import java.util.function.Predicate;

public class streamspractice {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,4,6,7,92,2,4);
        // Predicate<Integer>pre=new Predicate<Integer>() {
        //     public boolean test(Integer t){
        //         return t%2==0;

        //     }
        // };
        // long count=numbers.stream().filter(t->t%2==0).count();
        numbers.stream().filter(t->t%2==0).forEach(System.out::println);

        // System.out.println(count);
    }
    
}
