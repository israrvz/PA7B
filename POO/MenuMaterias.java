    import javax.swing.*;
    public class MenuMaterias {
    public static void main (String[] args) {
   	LeerAlumnos ma = new LeerAlumnos ();
    String opcion;
     int n;
   	do{
   	opcion=JOptionPane.showInputDialog ("Menu\n 1. Matematicas\n 2. English\n 3. Programacion \n 4.Salir");
   	n=Integer.parseInt (opcion);
   	switch(n)
   	{
   	 case 1:ma. Matematicas ();break;
   	 case 2:ma. English (); break;
   	 case 3:ma. Programacion ();break;
   	 case 4:System. exit (0);break;
   	}
   	}while(n!=4);}
    }
