import java.util.*;

public class ArraysCC{

    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is : " + maxSum);
    }

    public static void kadans(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            ms = Math.max(cs, ms);
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum is : " + ms);
    }

    public static void main(String args[]){
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadans(numbers);

    }
}