import javax.swing.JOptionPane;

public class Exercicio04 {
  public static void main(String[] args) {
    /*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
     Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
      caso haja uma divisão por 0 ou raiz de numero negativo */

      Double a,b,c;
      Double delta;

      a=Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de A:"));
      b=Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de B:"));
      c=Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de C:"));

      delta = (b*b)-4*a*c;

      if(a==0  | delta <0){
        System.out.println("Impossivel calcular");
      }else{
        Double R1 = (-b + Math.sqrt(delta))/(2*a);
        Double R2 = (-b - Math.sqrt(delta))/(2*a);
        //Float.parseFloat(R2);
        System.out.printf("Primeira Raiz %.5f", R1);
        System.out.printf("\nPrimeira Raiz %.5f", R2);
      }
  }
}
