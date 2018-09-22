import java.util.Scanner;

public class Vinicultores {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Asociación de Vinicultores\n");

    System.out.println("Ingresar el tipo de uva: ");
    String TI = input.nextLine();
    System.out.println("Ingresar el tamaño de la uva: ");
    int TA = input.nextInt();
    System.out.println("Ingresar el Precio de la uva: ");
    double P = input.nextDouble();
    System.out.println("Ingresar los kilos de producción: ");
    int K =input.nextInt();
    if (TI == "A" && TA == 1)
    P = P * .20;
    else P = P *.30;

    if (TI == "B" && TA ==2)
       P = P * -.30;
    else P = P *-.50;

double GA = P * K;
System.out.println("La ganancia es: "+ GA);
  }
}
