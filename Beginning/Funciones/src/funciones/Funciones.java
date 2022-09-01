/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Funciones {

    public static void main(String[] args) {
        int accesoFuncion = sumar(7, 9);
        System.out.println(accesoFuncion);
        operacion("sumar");
        Scanner leer = new Scanner(System.in);
        String operacionNueva;
        System.out.println("Ingrese el nombre de una nueva operacion: ");
        operacionNueva = leer.next();
        operacion(operacionNueva);
    }

//FORMATO DE FUNCION:
    //denominadorDeAccesibilidad Instanciacion Retorno
    public static int sumar(int ParametroA, int ParametroB) {
        //LOGICA
        int resultado = ParametroA + ParametroB;
        return resultado;
    }

//METODO     
    public static void operacion(String oper) {
        System.out.println("La operacion es " + oper + ".");
    }
}
