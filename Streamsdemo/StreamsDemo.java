package Streamsdemo;

    

    import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {

    private static Stream<Integer> stream;

    public static void main(String[] args) {
      
    
       
        List<Integer> list = Arrays.asList(15, 20, 76, 43, 24, 11);

        /* 
       int sum = 0;
        for(int n: list) {
        if(n%2 != 0) {
        n = n-5;
         sum = sum + n; 
            }
        }
        System.out.println(sum);
*/


/* 
Consumer<Integer> consumer = (t) -> System.out.println(t);
   list.forEach(consumer);
*/
 
        Stream<Integer> stream = list.stream();
        Stream<Integer> oddStream = stream.filter(k -> k%2!=0); 
        Stream<Integer> transformedStream = oddStream.map(k ->k-5);
        int s =  transformedStream.reduce(0, (p,q) -> p+q); 
        // System.out.println(s);
        
   transformedStream.forEach((t) -> System.out.println(t));
//    stream.forEach((t) -> System.out.println(t));


/* 

         int result = list.stream()
        .filter(a -> a%2!=0)
        .map(b -> b-5)
        .reduce(0, (n1,n2) -> n1+n2);
         System.out.println(result);
  */      


         
        // Predicate<Integer> predicate =   t ->  t%2!=0;
        // Function<Integer, Integer> fn = t ->  t-5;        
        // BinaryOperator<Integer> bin = (t, u) ->  t+u;



  

//    Stream<Integer> sortedStream = list.stream().filter(k -> k%2!=0).sorted(); // 15,43,11
//     sortedStream.forEach(k -> System.out.println(k));



    }
}
