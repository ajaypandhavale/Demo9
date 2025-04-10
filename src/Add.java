import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to perform addtion");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;
        System.out.println("addtion is :"+sum);

        System.out.println("Added line");
        System.out.println("Added line 1");

    }
}