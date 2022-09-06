//Accesibilidad controlada
package poo5_encapsulamientoset;

import poo5_encapsulamientoset.entidades.Empres;



public class POO5_EncapsulamientoSet {

    public static void main(String[] args) {
        Empres empresa1 = new Empres("Kang", "S.A", "ventas", true, 10);
//¿Como hacemos para cambiar un dato, ejemplo la orientacion?
        empresa1.setNombre("Pyatt");
        
        System.out.println(empresa1.nombreCHAAN??);  //QUE PASO?
    }
    
}
