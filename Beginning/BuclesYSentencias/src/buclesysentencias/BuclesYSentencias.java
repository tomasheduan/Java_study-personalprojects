/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesysentencias;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class BuclesYSentencias {

    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entero positivo: ");
            numero = leer.nextInt();
            if (numero > 1000) {
                System.out.println("El programa podria tardar. ¿ejercutar?(s/n)");
                String opcion = leer.next();
                if (opcion.equals("s")) {
                    break; //SENTENCIA DE SALTO
                }
            }
        } while (numero <= 0 || numero > 1000);
        int j, suma;
        for (int i = 1; i <= numero; i++) {
            if(i%2 != 0) //Si es impar...
                continue; //detiene la iteracion actual y salta a la siguiente
            
                suma = 0;
                j=1;
                while(j<=i)
                {
                    suma+=j;
                    j++;
                }
                System.out.println("La suma de los "+i+" numeros naturales es "+suma);
        }
    }
}
