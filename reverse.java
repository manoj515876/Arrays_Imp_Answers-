public class reverse {
    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length-1, temp;
        while(start < end){
            temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6};
        reverseArray(numbers);
    }
}
