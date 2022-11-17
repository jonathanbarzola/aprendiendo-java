import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        // String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;

        try {

            numeroDecimal = scanner.nextInt();  // Integer.parseInt(numeroStr);

        } catch (InputMismatchException e) {

            System.out.println("Error debe ingresar un número entero");
            main(args); // Volvemos a llamar a la función para ejecutar de nuevo el programa
            System.exit(0);  // Terminamos el proceso
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
