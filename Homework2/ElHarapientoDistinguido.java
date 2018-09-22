import java.util.Scanner;

public class ElHarapientoDistinguido {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("El Harapiento Distinguido\n");
    System.out.println("Ingresar costo del traje: ");
    double CT = input.nextDouble();
    double DE = 0;
    double PF = 0;
    if (CT >= 2500){
    DE =CT * .15;
    System.out.println("El descuento que obtendrá es: "+DE);
    PF = CT - DE;
    System.out.println("Precio final del traje: "+PF);
    }
    else if (CT < 2500){
    DE = CT *.08;
    System.out.println("El descuento que obtendrá es: "+DE);
    PF = CT - DE;
    System.out.println("Precio final del traje: "+PF);
    }
  }
}
