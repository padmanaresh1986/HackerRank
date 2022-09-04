public class ArrayJumping {

    /*
      given the array [0,1,0,0,0,1,0] find the minimum number of jumps  it takes from first to last
      0 is safe , 1 is unsafe should be avoided
      conditions : first and last elements of the array is always 0
                   1's never comes consecutively
                   each jump can skip only one element at a time

       in the above example jumping paths could be  0->2->4->6 = 3 jumps  or 0->2->3->4->6 = 4 jumps
       Answer is 3 jumps
     */

    public static void main(String[] args) {
        int[] numbers = {0,1,0,0,0,1,0};
        int jumps = calculateJumps(numbers);
        System.out.println(jumps);
    }

    private static int calculateJumps(int[] numbers) {
        int numOfJumps  = 0;
        int i = 0;
        while(i<numbers.length-1){
            if (numbers[i+2] == numbers.length || numbers[i+2] == 1 ){
                numOfJumps++;
                i++;
            }else{
                numOfJumps++;
                i = i+2;
            }
        }

        return numOfJumps;
    }

}
