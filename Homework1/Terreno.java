import java.util.Scanner;

public class Terreno {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    double basetr = 0;
    double alturar= 0;
    double ladoa =0;
    System.out.println("Calcular área de terreno \n");
    System.out.println("Ingresar la base del terreno:");
    basetr =reader.nextDouble();
    System.out.println("Ingresar lado a del terreno:");
    ladoa =reader.nextDouble();
    System.out.println("Ingresar lado c del terreno");
    alturar =reader.nextDouble();
    double alturat = ladoa - alturar;
    double at = (alturat * basetr)/2;
    double ar = basetr * alturar;
    double area = at+ar;
    System.out.println("EL area del terreno es:"+area);
  }
}
