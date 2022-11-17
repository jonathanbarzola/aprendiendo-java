public class SistemasNumericos {
    public static void main(String[] args){

        int numeroDecimal = 21;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b10101;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 025;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        
        int numeroHex = 0x15;
        System.out.println("numeroHex = " + numeroHex);
    }
}
