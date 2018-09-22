import java.util.Scanner;

public class PagoDeLapiz {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Caja de cobro\n");
    System.out.println("Ingresar cantidad de lapizes");
    int X = input.nextInt();
    double PAG =0;
    if (X >= 1000 ){
      PAG = X*0.85;
      System.out.println("El monto total a pagar es: "+PAG);
    }
    else if (X <1000) {
      PAG = X*0.90;
      System.out.println("El monto total a pagar es: "+PAG);
}
}
}
