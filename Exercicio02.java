import javax.swing.JOptionPane;

public class Exercicio02 {
  public static void main(String[] args) {
    /*Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
    Efetue a soma de A e B atribuindo o seu resultado na variável X. 
    Imprima X conforme exemplo apresentado abaixo. 
    Não apresente mensagem alguma além daquilo que está sendo especificado
     e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
      você receberá "Presentation Error". */
    
    //Declarando variável A e B
    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de A","Soma",JOptionPane.QUESTION_MESSAGE));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor de B","Soma",JOptionPane.QUESTION_MESSAGE));
    
    //Declarando variável |X
    int X = a + b;

    JOptionPane.showMessageDialog(null,"X = "+X);
  }
}
