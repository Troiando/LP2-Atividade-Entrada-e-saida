import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        System.out.println("Os números digitados na ordem inversa");
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);
    }
}