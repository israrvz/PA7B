import java.util.Scanner;

public class NumeroMayor{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Cual de los dos numeros es mayor\n");
    System.out.println("Ingrese el primer numero: ");
    int A = input.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int B = input.nextInt();

    if (A > B){
      System.out.println("El numero "+A +" es mayor");
    }
    else{
      System.out.println("El numero "+B +" es mayor");
    }

  }
}
