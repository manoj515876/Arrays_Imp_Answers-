public class MaxandMin {
    public static void maxAndMinArray(int numbers[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Min num is : " + min);
        System.out.println("Max num is : " + max);
    }
    public static void main(String args[]){
        int numbers[] = {1, 23, 523, 23, 52, 23 };
        maxAndMinArray(numbers);
    }
}
