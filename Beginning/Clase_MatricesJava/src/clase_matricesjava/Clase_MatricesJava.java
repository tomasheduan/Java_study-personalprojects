
package clase_matricesjava;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class Clase_MatricesJava {


    public static void main(String[] args) {
        int FIL = 5;
        int COL = 5;
        int[][] nombreMatrix=new int[5][5];
        //final int FIL=nombreMatrix.length;
        //final int COL=nombreMatrix[5].length;
        for (int i = 0; i < FIL; i++) 
            for (int j = 0; j < COL; j++){
            nombreMatrix[i][j]=(i+j);
            System.out.print(nombreMatrix[i][j]+" ");
            if(j==COL-1)
                    System.out.println("");
            }
        
        System.out.println("Ahora de forma aleatoria");
         for (int i = 0; i < FIL; i++) 
            for (int j = 0; j < COL; j++){
            nombreMatrix[i][j]=intValue(Math.random()*100);
            System.out.print(nombreMatrix[i][j]+" ");
            if(j==COL-1)
                    System.out.println("");
            }
    }
    
}
