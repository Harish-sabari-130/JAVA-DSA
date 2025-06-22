import java.util.*;
public class Decreno {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        decreno(n);
    }

    public static void decreno(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreno(n - 1);
    }
}