import javax.swing.JOptionPane;
public  class LeerAlumnos {
private int i,n;
private String Print,Valor;


       //:::::::::::::::::::::::::metodo Matematicas String::::::::::::::::::::::::::::::::.
       public  void Matematicas()
        {
       int elemen1=0,elemen2=0;
       int dato;
       String opcion;
       String   texto[]=new String  [0];
 	   String texto_t[]=new String [0];
             	do{
       		opcion=JOptionPane.showInputDialog ("Lista de alumnos \n 1.Ingresar nombre \n 2. Modificar\n 3. Eliminar\n 4. Mostrar\n 5. Salir");
       	  	dato=Integer.parseInt (opcion);
       	  		switch(dato)
       	  		{
       	  case 1:
    			if(texto.length==0)
    			{texto=new String [1];
    			texto[0]=JOptionPane.showInputDialog ("Ingrese el nombre   "  );}
    			else if(texto.length>0)
    			{texto_t=new String [texto.length+1];
    				for(int i=0;i<=(texto.length-1);i++)
    				{texto_t[i]=texto[i];}
    				texto_t[texto_t.length-1]=JOptionPane.showInputDialog  (null,"Ingrese el nombre  " );
    				texto=new String [texto_t.length];
    					for(int i=0;i<=(texto_t.length-1);i++)
    					{texto[i]=texto_t[i];}
    			}  //fin else
    			break;

    		   case 2:
    		   		if (texto.length >= 1) {
                            Print= "Num de alumnos " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del nombre que desea Modificar? " + Print, "Modificar el nombre", JOptionPane.QUESTION_MESSAGE);
                            if (Integer.parseInt(Valor) <= texto.length) {
                                n = Integer.parseInt(Valor);
                                texto[n - 1] =  JOptionPane.showInputDialog(null,"Nuevo nombre de la Posicion: " + n, "Modificar valor de la posicion", JOptionPane.QUESTION_MESSAGE);
                                Print = "Numero de Registros " + texto.length + "\n\n";
                                for (i = 0; i <= (texto.length - 1); i++) {
                                    Print= Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor de la posicion", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La Posicion seleccionada No existe!.", "Modificar valor de la Posicion", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor de la posicion", JOptionPane.ERROR_MESSAGE);
                        }

    		   break;
    		   case 3:
    		   	if (texto.length > 1) {
                            Print= "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + " : " + texto[i] + "\n";}
                           Valor= JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Eliminar. " + Print, "Eliminar datos de la posicion", JOptionPane.QUESTION_MESSAGE);
                           elemen1 =Integer.parseInt (Valor)-1;
                           if (elemen1 <= texto.length - 1) {
                                for (i =elemen1; i <= (texto.length - 1); i++) {
                                    if (i != texto.length - 1) {
                                        texto_t[i] = texto[i + 1];}}
                                texto= new String[texto_t.length - 1];
                                Print = "Numero de Registros " + texto.length + "\n\n";
                                for (i = 0; i <= (texto.length - 1); i++) {
                                    texto[i] = texto_t[i];
                                    Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                                }
                                texto_t = new String [texto.length];
                                for (i = 0; i <= (texto.length - 1); i++) {
                                   texto_t[i] = texto[i];}
                                JOptionPane.showMessageDialog(null, "Dato Eliminado Exitosamente! " + Print, "Eliminar dato de la posicion", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este arreglo.", "Eliminar valor de la posicion", JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (texto.length == 1) {
                            texto = new String [0];
                            texto_t= new String [0];
                            JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor de la posicion", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor de la posicion", JOptionPane.ERROR_MESSAGE);
                        }
    		   break;
    		   case 4:
    		   	String elem1,elem2;
    		   	if (texto.length >= 1) {
                            for (i = 0; i <= (texto.length - 1); i++) {
                                for (n = 0; n <= (texto.length - 2); n++) {
                                    elem1 = texto[n + 1];
                                    elem2 = texto[n];
                                    if (elem1.length ()< elem2.length ()) {
                                        texto[n] = elem1;
                                        texto[n + 1] = elem2;
                                    }
                                }
                            }
                            Print = "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos de la posicion", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos de la posicion", JOptionPane.ERROR_MESSAGE);
                        }
    		   break;
    		   case 5:
    		   System.exit (0);
    		   break;
       	  		}//fin swit

             	}while(dato!=6);
       }//fin metodo
       //:::::::::::::::::::::::::metodo English String::::::::::::::::::::::::::::::::.
       public  void English ()
        {
       int elemen1=0,elemen2=0;
       int dato;
       String opcion;
       String   texto[]=new String  [0];
      String texto_t[]=new String [0];
               do{
           opcion=JOptionPane.showInputDialog ("Lista de alumnos \n 1.Ingresar nombre \n 2. Modificar\n 3. Eliminar\n 4. Mostrar\n 5. Salir");
             dato=Integer.parseInt (opcion);
               switch(dato)
               {
           case 1:
         if(texto.length==0)
         {texto=new String [1];
         texto[0]=JOptionPane.showInputDialog ("Ingrese el dato   "  );}
         else if(texto.length>0)
         {texto_t=new String [texto.length+1];
           for(int i=0;i<=(texto.length-1);i++)
           {texto_t[i]=texto[i];}
           texto_t[texto_t.length-1]=JOptionPane.showInputDialog  (null,"ingrese el dato  " );
           texto=new String [texto_t.length];
             for(int i=0;i<=(texto_t.length-1);i++)
             {texto[i]=texto_t[i];}
         }  //fin else
         break;

          case 2:
             if (texto.length >= 1) {
                            Print= "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Modificar. " + Print, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                            if (Integer.parseInt(Valor) <= texto.length) {
                                n = Integer.parseInt(Valor);
                                texto[n - 1] =  JOptionPane.showInputDialog(null,"Nuevo dato de la Posicion: " + n, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                                Print = "Numero de Registros " + texto.length + "\n\n";
                                for (i = 0; i <= (texto.length - 1); i++) {
                                    Print= Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este vector!.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }

          break;
          case 3:
           if (texto.length > 1) {
                            Print= "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + " : " + texto[i] + "\n";}
                           Valor= JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Eliminar. " + Print, "Eliminar datos vel vector", JOptionPane.QUESTION_MESSAGE);
                           elemen1 =Integer.parseInt (Valor)-1;
                           if (elemen1 <= texto.length - 1) {
                                for (i =elemen1; i <= (texto.length - 1); i++) {
                                    if (i != texto.length - 1) {
                                        texto_t[i] = texto[i + 1];}}
                                texto= new String[texto_t.length - 1];
                                Print = "Numero de Registros " + texto.length + "\n\n";
                                for (i = 0; i <= (texto.length - 1); i++) {
                                    texto[i] = texto_t[i];
                                    Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                                }
                                texto_t = new String [texto.length];
                                for (i = 0; i <= (texto.length - 1); i++) {
                                   texto_t[i] = texto[i];}
                                JOptionPane.showMessageDialog(null, "dato Eliminado Exitosamente! " + Print, "Eliminar dato del vector", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este arreglo.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (texto.length == 1) {
                            texto = new String [0];
                            texto_t= new String [0];
                            JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }
          break;
          case 4:
           String elem1,elem2;
           if (texto.length >= 1) {
                            for (i = 0; i <= (texto.length - 1); i++) {
                                for (n = 0; n <= (texto.length - 2); n++) {
                                    elem1 = texto[n + 1];
                                    elem2 = texto[n];
                                    if (elem1.length ()< elem2.length ()) {
                                        texto[n] = elem1;
                                        texto[n + 1] = elem2;
                                    }
                                }
                            }
                            Print = "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                        }
          break;
          case 5:
          System.exit (0);
          break;
               }//fin swit

               }while(dato!=6);
       }
       //:::::::::::::::::::::::::metodo Programacion String::::::::::::::::::::::::::::::::.
       public  void Programacion()
        {
       int elemen1=0,elemen2=0;
       int dato;
       String opcion;
       String   texto[]=new String  [0];
      String texto_t[]=new String [0];
               do{
           opcion=JOptionPane.showInputDialog ("Lista de alumnos \n 1.Ingresar nombre \n 2. Modificar\n 3. Eliminar\n 4. Mostrar\n 5. Salir");
             dato=Integer.parseInt (opcion);
               switch(dato)
               {
           case 1:
         if(texto.length==0)
         {texto=new String [1];
         texto[0]=JOptionPane.showInputDialog ("Ingrese el dato   "  );}
         else if(texto.length>0)
         {texto_t=new String [texto.length+1];
           for(int i=0;i<=(texto.length-1);i++)
           {texto_t[i]=texto[i];}
           texto_t[texto_t.length-1]=JOptionPane.showInputDialog  (null,"ingrese el dato  " );
           texto=new String [texto_t.length];
             for(int i=0;i<=(texto_t.length-1);i++)
             {texto[i]=texto_t[i];}
         }  //fin else
         break;

          case 2:
             if (texto.length >= 1) {
                            Print= "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            Valor = JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Modificar. " + Print, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                            if (Integer.parseInt(Valor) <= texto.length) {
                                n = Integer.parseInt(Valor);
                                texto[n - 1] =  JOptionPane.showInputDialog(null,"Nuevo dato de la Posicion: " + n, "Modificar valor del vector", JOptionPane.QUESTION_MESSAGE);
                                Print = "Numero de Registros " + texto.length + "\n\n";
                                for (i = 0; i <= (texto.length - 1); i++) {
                                    Print= Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este vector!.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }

          break;
          case 3:
           if (texto.length > 1) {
                            Print= "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + " : " + texto[i] + "\n";}
                           Valor= JOptionPane.showInputDialog(null, "Cual es la posicion del Registro que desea Eliminar. " + Print, "Eliminar datos vel vector", JOptionPane.QUESTION_MESSAGE);
                           elemen1 =Integer.parseInt (Valor)-1;
                           if (elemen1 <= texto.length - 1) {
                                for (i =elemen1; i <= (texto.length - 1); i++) {
                                    if (i != texto.length - 1) {
                                        texto_t[i] = texto[i + 1];}}
                                texto= new String[texto_t.length - 1];
                                Print = "Numero de Registros " + texto.length + "\n\n";
                                for (i = 0; i <= (texto.length - 1); i++) {
                                    texto[i] = texto_t[i];
                                    Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                                }
                                texto_t = new String [texto.length];
                                for (i = 0; i <= (texto.length - 1); i++) {
                                   texto_t[i] = texto[i];}
                                JOptionPane.showMessageDialog(null, "dato Eliminado Exitosamente! " + Print, "Eliminar dato del vector", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La Posicion Seleccionada No existe en este arreglo.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (texto.length == 1) {
                            texto = new String [0];
                            texto_t= new String [0];
                            JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor del vector", JOptionPane.ERROR_MESSAGE);
                        }
          break;
          case 4:
           String elem1,elem2;
           if (texto.length >= 1) {
                            for (i = 0; i <= (texto.length - 1); i++) {
                                for (n = 0; n <= (texto.length - 2); n++) {
                                    elem1 = texto[n + 1];
                                    elem2 = texto[n];
                                    if (elem1.length ()< elem2.length ()) {
                                        texto[n] = elem1;
                                        texto[n + 1] = elem2;
                                    }
                                }
                            }
                            Print = "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print = Print + "Posicion " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos del vector", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos del vector", JOptionPane.ERROR_MESSAGE);
                        }
          break;
          case 5:
          System.exit (0);
          break;
               }//fin swit

               }while(dato!=6);
       }
}
