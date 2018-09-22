import java.util.Scanner;

public class LaLangostaHumana{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Banquetes la Langosta Humana\n");
    System.out.println("Ingresar numero de platillos: ");
    int NP =input.nextInt();
    double TOT = 0;
    if (NP > 300){
      TOT = NP * 75;
      System.out.println("Total a pagar por el banquete: "+TOT);
}
    else if (NP >= 200){
      TOT = NP * 85;
      System.out.println("Total a pagar por el banquete: "+TOT);
    }
    else if(NP < 200){
      TOT = NP * 95;
      System.out.println("Total a pagar por el banquete: "+TOT);
    }
  }
}
