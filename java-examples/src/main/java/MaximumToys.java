import java.util.Arrays;

public class MaximumToys {
    /**
     * given a list of prices and amount to spend , what is the maximum number of toys can buy
     * example
     * toy_Prices = {1,2,3,4}  budget = 7 ,
     * we can buy toys {1,2,3} and {3,4} , maximum 3 toys can buy , so answer is 3
     *
     */

    public static void main(String[] args) {
        int[] toyPrices = {1,2,3,4};
        int budget= 3;
        int maxToys =  calculateNumOfToys(toyPrices, budget);
        System.out.println(maxToys);

    }

    private static int calculateNumOfToys(int[] toyPrices, int budget) {
        Arrays.sort(toyPrices);
        int maxTOys = 0;
        for (int i = 0; i < toyPrices.length ; i++) {
            budget -= toyPrices[i];
            if(budget < 0 ){
                return maxTOys;
            }
            maxTOys++;
        }
        return maxTOys;
    }
}
