
import java.util.Scanner;

public class rectangulo {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
//declaración de variables
int altura = 0;
int base = 0;

//muestra mensaje Calcular area de rectangulo
System.out.println("Calcular área de rectángulo\n");
System.out.println("Ingresar altura:");
altura = reader.nextInt();
System.out.println("Ingresar base:");
base = reader.nextInt();
int area = altura*base;
System.out.println("EL área del rectangulo es:" + area);
}
}
