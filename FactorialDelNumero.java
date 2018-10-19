import javax.swing.JOptionPane;

public class FactorialDelNumero {
  public static void main(String[] args) {
    //este es el limite del factorial
    int value =
    Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a int value"));
    //numero del factorial
    int fact = 1;
    //Sentinela
    int i=1;
    while (i <= value){
      fact = fact * i;
      i++;
    }
    JOptionPane.showMessageDialog(null,"el factorial de: "+value+" es "+fact, "Calcular Factorial", JOptionPane.WARNING_MESSAGE);
  }
}
