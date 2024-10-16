import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;
        int contador = 1;
        int num;

        System.out.println("Introduce un numero: (0 para salir)");
        num = scan.nextInt();

        while (contador <= num){
            if (contador % 2== 0){
                contadorPares = contadorPares + contador;
            }
            else {
                contadorImpares = contadorImpares + contador;
            }
            contador++;
        }
        System.out.println("La suma de los pares desde 1 hasta " + num + " es " + contadorPares);
        System.out.println("La suma de los impares desde 1 hasta " + num + " es " + contadorImpares);


    }
}
