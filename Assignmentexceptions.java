import java.util.*;
class Assignmentexceptions {
    public static void main(String[] args) {
        int[] arr = {12, 11, 15, 0, 12, 13};
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
