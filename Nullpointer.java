import java.util.*;
class Nullpointer {
    public static void main(String[] args) {
        Integer[] arr = {12, 11, 15, null, 12, 13};
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to divide: ");
            int num = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                try {
                    int result = num / arr[i];
                    System.out.println(num + " / " + arr[i] + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e);
            }
        }
    }
}