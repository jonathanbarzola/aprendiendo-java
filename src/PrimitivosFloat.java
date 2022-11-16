public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 0.00000000015f; // 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Float corresponde en bits a: " + Float.SIZE);
        System.out.println("Máximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float: " + Float.MIN_VALUE);

        System.out.println("=========");

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Double corresponde en bits a: " + Double.SIZE);
        System.out.println("Máximo valor para Double: " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para Double: " + Double.MIN_VALUE);

        var varFlotante = 3.1416; // Es una variable dinámica se le asigna el tipo de su valor asignado
    }
}
