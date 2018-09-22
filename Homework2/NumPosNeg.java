import java.util.Scanner;

public class NumPosNeg{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Numero positivo o negativo\n");
    System.out.println("Ingrese un numero: ");
    int NUM = input.nextInt();
    String R ="negativo";
    if (NUM > 0){
    System.out.println("EL numero "+ NUM +" es positivo");
    }
    else{
    System.out.println("El numero "+ NUM + " "+R);
  }
  }
}
