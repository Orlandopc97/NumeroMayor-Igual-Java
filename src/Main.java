import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //pedir dos numeros y decir cual es el mayor o si son iguales

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));

        if (num1 == num2){
            JOptionPane.showMessageDialog(null,"los numeros son iguales ");
        } else if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El primer numero: " + num1 + " es mayor");
        }
        else {
            JOptionPane.showMessageDialog(null,"el  segundo numero: " + num2 + " es mayor");
        }
    }
}