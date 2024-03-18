import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la factura:");
        String nombreFactura = scanner.nextLine();
        System.out.println("Introduzca el precio del primer producto");
        Double primerPrecio = scanner.nextDouble();
        System.out.println("Introduzca el precio del segundo producto");
        Double segundoPrecio = scanner.nextDouble();
        double precioTotal = primerPrecio + segundoPrecio;

        System.out.println("La factura '" + nombreFactura + "' tiene un total bruto de " + precioTotal + "$, con un impuesto total de " + precioTotal * 0.19 + "$. El total de la factura es: " + precioTotal * 1.19 + "$.");
    }
}
