/*
4. Leer 3 números y mostrar el mayor de ellos.
 */
package numeromayor04;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroMayor04 {

    public static void main(String[] args) {
        int numeroA;
        int numeroB;
        int numeroC;
        int mayor = 0;

        try {
            numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero A"));
            numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero B"));
            numeroC = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero C"));

            if (numeroA > numeroB) {
                mayor = numeroA;
            }
            if (numeroB > numeroA) {
                mayor = numeroB;
            }
            if (numeroC > mayor) {
                mayor = numeroC;
            }

            JOptionPane.showMessageDialog(null, "El mayor es : " + mayor);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar el valor ingresado " + e);

        }

    }

}
