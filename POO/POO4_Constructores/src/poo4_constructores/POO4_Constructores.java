
package poo4_constructores;

import poo4_constructores.entidades.Empresa;
import poo4_constructores.entidades.Usuario;

public class POO4_Constructores {


    public static void main(String[] args) {
        Empresa negocio1 = new Empresa();
        negocio1.deficit = false;
        negocio1.empleados = 40;
        negocio1.nombre = "Idosan";
        negocio1.orientacion = "Marketing";
        negocio1.tipo = "S.A.";
        
        Empresa negocio2=new Empresa("Kerl", "SRL", "Produccion");
        //Usuario user1 = new Usuario(nombre, apellido, 0, nacimiento, pais);
        System.out.println(negocio2.nombre);
        Empresa negocio3=new Empresa();
        System.out.println(negocio3.empleados);
    }
}
