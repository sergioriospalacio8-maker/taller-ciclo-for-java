import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){

        int cantidadVentas;
        double ValorVenta;
        double totalVentas = 0;

        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas se realizaron en el dia?"));

        for (int i = 1; i <= cantidadVentas; i++){

            ValorVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta #" + i));

            totalVentas = totalVentas + ValorVenta;

        }
        JOptionPane.showMessageDialog(null,"El total de ventas del dia es: $" + totalVentas );
    }
}
