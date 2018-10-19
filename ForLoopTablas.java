import java.util.Scanner;
public class ForLoopTablas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Tablas de multiplicar\n");
System.out.println("Ingresar el numero de tabla quiere ver.");
int i = input.nextInt();

    for( i = 0; i <= 9; i ++){
      System.out.println("1 x "+ (i + 1) + " = "+(i+1)*1);

    }
  }
}
