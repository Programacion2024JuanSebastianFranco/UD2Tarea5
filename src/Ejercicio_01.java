import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;
        int num = 0;

        System.out.println("Introduce un numero: (0 para terminar)");
        num = scan.nextInt();

        while(num != 0){
            if (num % 2==0){
                contadorPares++;
            }
            else {
                contadorImpares++;
            }
            System.out.println("Introduce un numero: (0 para terminar)");
            num = scan.nextInt();
        }
        System.out.println("Has introducido " + contadorPares + " numero/s par/es y " + contadorImpares + " numero/s impar/es");

    }
}