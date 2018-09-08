import java.util.Scanner;

public class Circulo {

 public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);
  // declaración de variables
  double radio = 0;
  double pi = 3.1416;

  System.out.println("Calcular el área de una circunferencia \n");
  System.out.println("Ingresar el radio:");
  radio = reader.nextDouble();
  double area = (radio * radio) *(pi);
  System.out.println("El área de la circunferencia es:" + area);
}
}
