import java.util.Scanner;

public class Conagua {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);


    System.out.println("Calculo de consumo de metros cubicos de agua\n");
    System.out.println("Costo por metro cúbico: ");
    double CM = reader.nextDouble();
    System.out.println("Altura de la alberca: ");
    double A = reader.nextDouble();
    System.out.println("Largo de la alberca: ");
    double L = reader.nextDouble();
    System.out.println("Ancho de la alberca: ");
    double N =reader.nextDouble();
    double V = (A * L * N);
    System.out.println("El volumen de la alberca es: " + V);
    double PAG = CM * V;
    System.out.println("Pago a realizar por el consumo: " + PAG);

  }
}
