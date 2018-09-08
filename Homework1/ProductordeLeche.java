import java.util.Scanner;

public class ProductordeLeche{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    double galon = .264172;
    System.out.println("Registro de producción de leche\n");
    System.out.println("Precio por Galon:");
    double pg = reader.nextDouble();
    System.out.println("Ingresar numero en litros de leche producidos:");
    double litro = reader.nextDouble();
    double galont = litro * galon;
    System.out.println("Cantidad de Galones producidos:"+galont);
    double ga = galont * pg;
    System.out.println("Ganancia por la entrega de la leche:" + ga);

  }
}
