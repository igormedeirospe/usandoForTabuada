import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*
    Algoritimo que ler um número digitado pelo usuario e imprima a tabuada
    desse número.
    */
        int NumDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero e será mostrada a tabuada dele ", "Tabuada", JOptionPane.QUESTION_MESSAGE));
    for (int i = 1; i < 10; i++){
        System.out.printf("%d x %d = %d \n", NumDigitado, i, NumDigitado * i);
    }

    }
}