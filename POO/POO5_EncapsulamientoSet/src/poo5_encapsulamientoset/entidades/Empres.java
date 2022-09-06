
package poo5_encapsulamientoset.entidades;

public class Empres {
    private String nombre;
    private String tipo;
    //tipo: S.R.L, S.A, S.A.S
    private String orientacion;
    //produccion, producto, marketing, ventas.
    private boolean deficit;
    private int empleados;
    
    
    //Constructor  -> explicar Alt+Insert

    public Empres(String nombre, String tipo, String orientacion, boolean deficit, int empleados) {
        this.nombre = nombre;
        this.tipo = tipo;
        if(orientacion.equals("produccion")||orientacion.equals("producto")||orientacion.equals("marketing")||orientacion.equals("ventas"))
        {
            this.orientacion = orientacion; 
        }
        this.deficit = deficit;
        this.empleados = empleados;
    }
    //nuestro primer Set    
        public void setNombre(String nombre){
            
            if(nombre.length()>0)
            {
            this.nombre=nombre;
            }
        }
    }
    
