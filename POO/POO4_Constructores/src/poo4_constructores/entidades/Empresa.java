
package poo4_constructores.entidades;

public class Empresa {
    public String nombre;
    public String tipo;
    //tipo: S.R.L, S.A, S.A.S
    public String orientacion;
    //produccion, producto, marketing, ventas.
    public boolean deficit;
    public int empleados;
    
    
    //Constructor  -> explicar Alt+Insert

    public Empresa() {
        
    }
    
    public Empresa(String nombre, String tipo, String orientacion)
    {
        this.nombre=nombre;
        this.tipo=tipo;
        this.orientacion=orientacion;
    }

   
    //Aplicar Alt+Insert
    
    
}
