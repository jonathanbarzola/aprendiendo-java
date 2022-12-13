public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        // A la variable curso concatenamos "con" y la variable profesor y se retorna el resultado, NO se modifica el string original.
        String resultado2 = curso.transform(c -> c + " con " + profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        // Reemplazamos todas las "a" por "A", los strings son inmutables, por lo tanto, no se altera el original.
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
