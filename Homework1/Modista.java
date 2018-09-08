import java.util.Scanner;

public class Modista {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    double cm = 0;
    double pulgada = .0254;

    System.out.println("Modista");
    System.out.println("Cantidad de tela en metros: ");
    cm =reader.nextDouble();
    double pg = cm / pulgada;
    System.out.println("La cantidad en pulgadas que se necesitan es: " + pg);
  }
}
