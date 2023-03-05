import java.util.Scanner; 

public class AT5 {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o raio do círculo? ");
        double raio = sc.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é " + area);
    }
}

