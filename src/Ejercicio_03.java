import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Introduce numero, introduce 0 para finalizar.\nIngresa un numero: ");
        num = scan.nextInt();


        while (num != 0) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
            System.out.print("Ingresa un numero: ");
            num = scan.nextInt();
        }

        if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        } else {
            System.out.println("No ingresaste ningún numero valido.");
        }

    }
}