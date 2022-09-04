import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class PairOfNumbers {
    /*
    given the integer array , identify the number of pairs in the array
    for example , [1,2,1,2,1,3,2] , this array contains 2 pairs [1,1] and [2,2] remaining values [1,3,2] does not have pair value
    result is 2
     */

    public static void main(String[] args) {
        int[] numbers = {1,2,1,2,1,3,2,1,4,4};
        Set<Integer> set = new HashSet<>();
        AtomicInteger count = new AtomicInteger(0);
        Arrays.stream(numbers).forEach( num ->{
            if(!set.contains(num)){
                set.add(num);
            }else{
                count.incrementAndGet();
                set.remove(num);
            }
        });

        System.out.println(count);

    }
}
