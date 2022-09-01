/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 * @author tomas
 */
public class Condicionales {

    
    public static void main(String[] args) {
       int opinion; 
       Scanner leer = new Scanner(System.in);
       System.out.println("Opiniones: \n 1-> MUY MALA \n 2-> MALA \n 3-> REGULAR \n 4-> BUENA \n 5-> EXCELENTE");
       System.out.println("Ingresar opinion: ");
       opinion = leer.nextInt();
       if(opinion>=1 && opinion <= 5)
       {
           switch(opinion)
           {
               case 1:
                   System.out.println("Lamentamos que la pelicula le parezca MUY MALA");
                   break;
               case 2:
                   System.out.println("Lamentamos que la pelicula le parezca MALA");
                   break;
               case 3:
                   System.out.println("Lamentamos que la pelicula le parezca REGULAR");
                   break;
               case 4:
                   System.out.println("Que bueno que la pelicula le parezca BUENA");
                   break;
               case 5:
                   System.out.println("Que bueno que la pelicula le parezca EXCELENTE");
                   break;
           }
       }
       else if(opinion == 0)
       {
           System.out.println("No se puede ingresar 0");
       }
       else if(opinion < 0)
       {
           System.out.println("No se pueden ingresar valoraciones negativas");
       }
       else
       {
           System.out.println("Valoracion fuera de rango");
       }
        System.out.println("FIN DE PROGRAMA");
    } 
}
