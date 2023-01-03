
	

import javax.swing.JOptionPane;

public class ListaDeParametros {   

    public static void main(String[] args) { 

        int x = 2, y = 2;
        soma(x, y);
    }

    public static void soma(int a, int b) { 

        int resultado = a + b;
        JOptionPane.showMessageDialog(null, resultado);
    }

}

