import java.util.Scanner;
public class Cadenas {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Escribe tu nombre");
    String nombre = input.next();
    System.out.println("Tu nombre es: "+ nombre);
    System.out.println("Mi nombre tiene "+nombre.length()+" letras.");
    System.out.println("La primera letra de mi nombre es: "+nombre.charAt(0));
    int ultima_letra;

    ultima_letra = nombre.length();
    System.out.println("La ultima letra de mi nombre es: "+nombre.charAt(ultima_letra-1));
  }
}
