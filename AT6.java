import java.util.Scanner; 

public class AT6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura da parede em metros? ");
        double largura = sc.nextDouble();
        System.out.print("Altura da parede em metros? ");
        double altura = sc.nextDouble();

        double area = largura * altura;
        double qtdDeTinta = area * 0.3; 

        int qtdDeLatas = (int) Math.ceil(qtdDeTinta / 2.0);

        System.out.println(qtdDeLatas + " latas de tinta para pintar a parede.");
    }
}

