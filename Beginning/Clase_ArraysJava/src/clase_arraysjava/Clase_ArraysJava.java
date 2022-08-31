package clase_arraysjava;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class Clase_ArraysJava {

    public static void main(String[] args) {
        int[] nombreArray=new int[10];
        final int LONG=nombreArray.length;
        for (int i = 0; i < LONG; i++) {
            nombreArray[i]=i;
            System.out.println(nombreArray[i]);
        }
        System.out.println("Ahora de forma aleatoria");
        for (int i = 0; i < LONG; i++) {
            nombreArray[i]=intValue(Math.random()*100);
            System.out.println(nombreArray[i]);
        }
    }

}
