package poo6_encapsulamentoget.entidades;

public class Empresa {

    private String nombre;
    private String tipo;
    //tipo: S.R.L, S.A, S.A.S
    private String orientacion;
    //produccion, producto, marketing, ventas.
    private boolean deficit;
    private int empleados;

    public Empresa(String nombre, String tipo, String orientacion, boolean deficit, int empleados) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.orientacion = orientacion;
        this.deficit = deficit;
        this.empleados = empleados;
    }

    public void setNombre(String nombre) {
        
        this.nombre=nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public void setDeficit(boolean deficit) {
        this.deficit = deficit;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }
    
    public String getNombre(){
                return nombre;
            }

    public String getTipo() {
        return tipo;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public boolean isDeficit() {
        return deficit;
    }

    public int getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", tipo=" + tipo + ", orientacion=" + orientacion + ", deficit=" + deficit + ", empleados=" + empleados + '}';
    }
    
    
}
