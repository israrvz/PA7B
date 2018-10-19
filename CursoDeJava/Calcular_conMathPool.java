import java.util.Scanner;
public class Calcular_conMathPool {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Elevar un numero a una potencia\n");
    System.out.println("Ingrese un numero: ");
    double num = input.nextDouble();
    System.out.println("Ingrese ^: ");
    double pot = input.nextInt();

    double resultado = Math.pow(num, pot);

    System.out.println("La potencia del numero "+num+" es: "+resultado);

  }
}
