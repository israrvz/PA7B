import java.util.Scanner;

public class ThreeNumbers {
 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Numeros de mayor a menor\n");
  System.out.println("Ingresar primer numero: ");
  int A = input.nextInt();
  System.out.println("Ingresar segundo numero: ");
  int B = input.nextInt();
  System.out.println("Ingresar tercer numero: ");
  int C = input.nextInt();
  if ((A > B && B > C) || (B > )){
  System.out.println("El "+ A +" es primer numero") ;
} if (B < A && B > C){
  System.out.println("El "+ B +" es segundo numero") ;
} if (C < A && B > C) {
System.out.println("El "+ C +" es el tercer numero");
}
 }
}
