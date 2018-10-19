import javax.swing.JOptionPane;

public class DoWhileLoop {
  public static void main(String[] args) {
    int data;
    int sum =0;
        do{
      data =
      Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an int value the program exits if the input is 0"));

      sum += data; //acumulador
    } while(data !=0);
  }
}
