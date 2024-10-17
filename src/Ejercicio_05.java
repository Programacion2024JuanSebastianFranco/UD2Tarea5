import java.util.Scanner;
public class Ejercicio_05 {
    public static void main(String[] args) {
        //Declarar flujo de trabajo
        Scanner scan = new Scanner(System.in);

        //Imprimir preguntas de recoleccion de informacion al usuario
        System.out.println("Introduce dos numeros iniciales");
        System.out.println("Numero 1: ");
        int num1 = scan.nextInt();
        System.out.println("Numero 2: ");
        int num2 = scan.nextInt();

        //Imprimir valor limitante
        System.out.println("Introduce un valor limite: ");
        int limite = scan.nextInt();

        //declarar variables de operacion
        int anterior1 = num1;
        int anterior2 = num2;
        int contador = 3;
        int siguiente;

        //Imprimir resultado inicial
        System.out.println("Serie de suma \n" + num1 + "\n" + num2);

        //Operacion algoritmica do-while
        do {
            siguiente = anterior1 + anterior2;
            System.out.println(siguiente);
            anterior1 = anterior2;
            anterior2 = siguiente;
            contador++;
        } while(contador <= limite);

    }
}