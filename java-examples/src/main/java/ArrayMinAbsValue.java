import java.util.Arrays;

public class ArrayMinAbsValue {

    /**
     * consider the array of elements , consider the min absulute value
     * for example [-2,2,4] we can create 3 pairs
     * [-2,2], [-2,4],[2,4]
     * -2-2 = 4 , -2-4=6 , 2-4 = 2, answer is 2
     */


    public static void main(String[] args) {
        int[]  arr = {-2,2,4};
        Arrays.sort(arr);
        int minAbsDiff = Integer.MAX_VALUE;

        for(int i=0; i<arr.length-1;i++){
            int currtAbsDiff = Math.abs(arr[i] - arr[i+1]);
            minAbsDiff = Math.min(currtAbsDiff,minAbsDiff);
        }
        System.out.println(minAbsDiff);

    }
}
