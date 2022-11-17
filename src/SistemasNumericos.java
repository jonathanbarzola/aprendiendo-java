import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args){

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args); // Volvemos a llamar a la función para ejecutar de nuevo el programa
            System.exit(0);  // Terminamos el proceso
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        int numeroBinario = 0b10101;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 025;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        
        int numeroHex = 0x15;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
