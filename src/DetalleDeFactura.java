import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura:");
        String nombreFactura = sc.nextLine();

        System.out.println("Ingrese el primer monto:");
        double precio1 = sc.nextDouble();

        System.out.println("Ingrese el segundo monto:");
        double precio2 = sc.nextDouble();

        double total = precio1 + precio2;
        double impuesto = total * 0.19;
        double montoFinal = total + impuesto;

        String factura = "La factura " + nombreFactura + " tiene un total bruto de " + total + ", con un impuesto de " + impuesto + " y el monto después del impuesto es de " + montoFinal;

        System.out.println(factura);
    }
}
