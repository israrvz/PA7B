import java.util.Scanner;

public class Barquillo {
 public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);

double radio = 0;
double ladoh = 0;
System.out.println("Calcular el área de la figura en forma de helado \n");
System.out.println("Ingresar el radio del medio circulo");
radio = reader.nextDouble();
double ac = ((3.1416) * (radio*radio))/2;
System.out.println("Ingresar lado h de la figura:");
ladoh = reader.nextDouble();
double ht = ((ladoh * ladoh)-(radio * radio));
double rht = Math.sqrt(ht);
double at = (rht * radio);
double atf = ac+at;
System.out.println("El área de la figura es:" + atf);
 }
}
