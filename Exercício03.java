import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class Exercício03 {
  public static void main(String[] args) {
    /*Leia dois valores inteiros, no caso para variáveis A e B.
     A seguir, calcule a soma entre elas e atribua à variável SOMA.
      A seguir escrever o valor desta variável */

    int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de A:"));
    int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de B"));

    int SOMA = A + B;
    System.out.printf("SOMA = %d", SOMA);
  
  }
}
