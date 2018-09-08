import java.util.Scanner;

public class SueldoDeEmpleado {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    System.out.println("Sueldo semanal de Empleado\n");
    System.out.println("Pago por hora trabajada:");
    double phora = reader.nextDouble();
    System.out.println("Horas trabajadas a la semana:");
    double thoras = reader.nextDouble();
    double sueldo = phora * thoras;
    System.out.println("El empleado cobra por hora de trabajo: $"+ phora +
    " y trabajo: "+ thoras + " horas. Su sueldo semanal es: $"+sueldo);

  }
}
