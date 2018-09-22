import java.util.Scanner;

public class CualCantidadEsMayor{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Cual de las tres cantidades es la mayor");
    System.out.println("Ingresar primer valor: ");
    int A = input.nextInt();
    System.out.println("Ingresar segundo valor: ");
    int B = input.nextInt();
    System.out.println("Ingresar tercer valor: ");
    int C = input.nextInt();
    int M = 0;
    if (A > B && A > C){
    M = A;
  System.out.println("El valor mayor es: "+M);}
    else if (B > C ){
    M = B;
  System.out.println("El valor mayor es: "+M);}
    else if(C > B){
    M = C;
    System.out.println("El valor mayor es: "+M);
  }
  }
}
