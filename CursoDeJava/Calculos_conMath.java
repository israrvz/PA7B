import java.util.Scanner;
public class Calculos_conMath{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

System.out.println("Raiz cuadrada de un numero \n");
System.out.println("Ingrese un numero: ");
double num = input.nextDouble();
double raiz = Math.sqrt(num);
System.out.println("La raiz cuadrada de "+num+" es: "+raiz);

  }
}
