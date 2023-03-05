public class AT2 {

        public static void main(String[] args) {
            int a = 1, b = 2, c = 3;
            int aux;
    
            aux = a;
            a = c;
            c = b;
            b = aux;
    
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
        }
    }

