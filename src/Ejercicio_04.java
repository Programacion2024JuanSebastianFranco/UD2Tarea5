import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        //Declaraccion de flujo de trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de variables de almacenamiento
        int conFallados = 0;
        int conValidos = 0;

        //Almacenar ultimo numero para comprobacion
        int ultimo;

        //Imprimir datos al usuario
        System.out.println("Introduce numeros. Introduce 0 para finalizar.");
        int num = scan.nextInt();

        //Igualar ese numero como ultimo numero
        ultimo = num;

        //En caso de ser 0 el primer numero no suma a numeros validos
        if (num != 0){
            conValidos++;
        }

        //Iniciacion de algoritmo while
        while (num != 0) {
            System.out.println("Introduce un numero: ");
            int siguiente = scan.nextInt();

            //Para salir del bucle se hace uso de el siguiente numero para comprobar si es 0
            if(siguiente == 0){
                num = 0;
            }
            else if (num < siguiente) {
                conValidos++;
                num = siguiente;
                ultimo = num;
            } else {
                System.out.println("Tu numero debe ser mayor a tu anterior numero: " + ultimo);
                conFallados++;
            }
        }
        //Imprimir Validos y Fallos
        System.out.println("Total de numeros introducidos (excluyendo el 0): " + conValidos);
        System.out.println("Total de numeros fallados: " + conFallados);
    }
}
