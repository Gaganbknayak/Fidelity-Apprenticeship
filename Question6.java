public class Question6 {
    public static void main(String[] args) {
        int[] num = {1,2,3,54,52,52,9,90};
        int sum = sumEven(num);
        System.out.println("sum of given array: "+sum);
    }
    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
