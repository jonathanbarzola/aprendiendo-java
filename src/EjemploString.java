public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        /* Comparación por referencia */
        boolean esIgual = curso == curso2;
        System.out.println("curso y curso2 comparados por referencia son iguales? " + esIgual);

        /* Comparación por valor */
        esIgual = curso.equals(curso2);
        System.out.println("curso y curso2 comparados por valor son iguales? " + esIgual);

        /* Cuando le asignamos un valor ya existente a otra variable lo que hace es asignarlo por referencia */
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
