import java.util.Scanner;

public class Banco{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

   System.out.println("Banco Pueblo Desconocido\n");
   System.out.println("Ingresar el tipo de tarjeta que tiene: ");
   int TT = input.nextInt();
   System.out.println("Ingresar limite actual de crédito: ");
   double LA = input.nextDouble();
   double AC = 0;
   if (TT == 1) AC =LA *.25;
   if (TT == 2) AC =LA *.30;
   if (TT == 3) AC =LA *.40;
  else if (TT >3) AC = LA *.50;

  double NC = LA + AC;
  System.out.println("El aumento del credito es: "+AC);
  System.out.println("El nuevo limite del credito es: "+NC);
  }
}
