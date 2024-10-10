package Recursividad;

public class Recursiva {

   
    public int fibonacci(int n) {
        if (n == 0) {
            return 0; //
        } else if (n == 1) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }

    public int potencia(int base, int exp) {
        if (exp == 0) {
            return 1; 
        } else {
            return base * potencia(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        Recursiva recursiva = new Recursiva();

        int n = 6; 
        System.out.print("SALIDA " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(recursiva.fibonacci(i) + " ");
        }
        System.out.println();

        
        int base = 2;
        int exp = 4;
        System.out.println("Potencia de " + base + " elevado a " + exp + " es: " + recursiva.potencia(base, exp));
    }
}
