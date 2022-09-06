
package poo6_encapsulamentoget;

import poo6_encapsulamentoget.entidades.Empresa;


public class POO6_EncapsulamentoGet {


    public static void main(String[] args) {
        Empresa empresa1=new Empresa("Kang", "S.A", "ventas", true, 10);
        empresa1.setNombre("Pyatt");
        System.out.println(empresa1.toString());
    }
    
}
