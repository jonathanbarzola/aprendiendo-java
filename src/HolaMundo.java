public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int edad = 21;
        System.out.println("edad = " + edad);
        boolean isSingle = true;
        if (isSingle) {
            System.out.println("Estas solterito 😁😁😁");
        } else {
            System.out.println("Estas casado 😭😭😭");
        }

        String nombre;
        nombre = "Jonathan";

        if (edad < 10) {
            nombre = "Daniel";
        }

        System.out.println("nombre = " + nombre);
    }
}
