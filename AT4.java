import java.util.Scanner;

public class AT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();

        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();

        int diasDV = idade * 365;

        System.out.println("você já viveu aproximadamente " + diasDV + " dias.");
    }
}
