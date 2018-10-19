import java.util.Scanner;
public class Cadenas3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String alumno1, alumno2;

    alumno1 = "David";
    alumno2 = "David";

    System.out.println(alumno1.equals(alumno2));

    System.out.println("Ingrese su correo electronico:");
    String correo1 = input.next();
    System.out.println("Ingresar nuevamente su correo electronico");
    String correo2 = input.next();
    System.out.println(correo1.equals(correo2));

  }
}
