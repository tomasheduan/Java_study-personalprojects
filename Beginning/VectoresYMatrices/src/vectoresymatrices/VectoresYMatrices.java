/*
Multiplicacion de vector con matriz:
vector: 1xN
matriz: NxM
producto: 1xM
Ejemplo:
vector: 1x2 -> [2,3]

matriz: 2x3 -> [4,1,5]
               [7,6,8]

producto = [(2x3)+(3x7),(2x1)+(3x6),(2x5)+(3x8)]
producto = [29,20,34]
 */
package vectoresymatrices;

import java.util.Scanner;

/**
 * @author tomas
 */
public class VectoresYMatrices {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion y  cracion de un vector 
        //tipo [] nombreVector = new tipo[Tamaño];
        //declaramos el arreglo de una dimension
        int[] vector;
        //creamos en la memoria el vector y lo dimensionamos, por defecto todo vale NULL;
        vector = new int[2];
        //Pero esto se puede realizar todo de una vez...
        int[] producto = new int[3];
        //Declaracion y asignacion de dimension y contenido en un solo paso...
        int[][] matriz = {{4,1,5},{7,6,8}};
        System.out.println("Ingrese los valores del vector con tamaño "+vector.length +":");
        //trabajamos con los tamaños de los arreglos creados
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("v["+i+"]=");
             vector[i]=leer.nextInt();
        }
        int sum=0;
        for(int j=0;j<matriz[0].length;j++)
        {
            sum=0;
            for(int i=0;i<vector.length;i++)
            {
                sum+=vector[i]*matriz[i][j];
            }
            producto[j]=sum;
        }
        String aux = "";
        System.out.println("*Vector: ");
        for(int elemento: vector) // FOR ENHANCED
        {
            aux = aux+"   "+elemento;
        }
        System.out.print(aux);
        System.out.println("\n*Matriz: ");
        for(int[]fila: matriz)
        {
            aux="";
            for(int elemento:fila)
            {
               aux = aux+"   "+elemento; 
            }
            System.out.println(aux);
        }
        aux="";
        System.out.println("\n*Vector x Matriz: ");
        for(int elemento: producto)
        {
             aux = aux+"   "+elemento; 
        }
        System.out.println(aux);
    }
    
}
