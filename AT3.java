import java.util.Scanner;
public class AT3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, eu sou o Nº 1, como é seu nome?");
        String nome = sc.nextLine();

        System.out.println("Bem-vindo ao clube, " + nome + "!");
    }
}
