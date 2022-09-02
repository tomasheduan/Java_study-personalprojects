package poo3_primerosobjetos;

import java.util.Scanner;
import poo3_primerosobjetos.entidades.Empresa;
import poo3_primerosobjetos.entidades.Usuario;

public class POO3_primerosObjetos {

    public static void main(String[] args) {
        //Interactuamos con los objetos
        Empresa negocio1 = new Empresa();
        negocio1.deficit = false;
        negocio1.empleados = 40;
        negocio1.nombre = "Idosan";
        negocio1.orientacion = "Marketing";
        negocio1.tipo = "S.A.";

        Empresa negocio2 = new Empresa();
        negocio2.deficit = true;
        negocio2.empleados = 20;
        negocio2.nombre = "Elok";
        negocio2.orientacion = "Produccion";
        negocio2.tipo = "S.R.L";

        System.out.println("La Empresa: " + negocio1.nombre + " " + negocio1.tipo);
        System.out.println("Posee "+negocio1.empleados+" empleados activos.");
        System.out.println("Esta orientada estrategicamenete al area de "+negocio1.orientacion);
        
        Scanner leer = new Scanner(System.in);
        negocio1.nombre = leer.next();
        
        System.out.println("La Empresa: " + negocio1.nombre + " " + negocio1.tipo);
        System.out.println("Posee "+negocio1.empleados+" empleados activos.");
        System.out.println("Esta orientada estrategicamenete al area de "+negocio1.orientacion);
        
    }

}
