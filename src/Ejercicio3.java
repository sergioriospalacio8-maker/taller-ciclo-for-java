import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args){

        int cantidad;
        double temperatura;
        double temperaturaMaxima = 0;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lecturas de temperatura:"));

        for (int i = 1; i <= cantidad; i++){
            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura #" + i + "(°C):"));

            if (temperatura > temperaturaMaxima){
                temperaturaMaxima = temperatura;
            }
        }
        JOptionPane.showMessageDialog(null,"La temperatura maxima registrada fue:" + temperaturaMaxima + "°C");
    }
}
