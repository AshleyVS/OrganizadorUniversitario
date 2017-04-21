
package organizadoruniversitario.principal;

public class Carrera {
   private String nombre;  
   private int codigoCarrera;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    private void parse(String fila){
        String[] valores = fila.split(",");
        this.codigoCarrera = Integer.parseInt(valores[0]);
        this.nombre = valores [1]; 
    
    } // PARSE ENDS
    
    public Carrera(String csv){
        this.parse(csv);
    }
    
} // CARRERA ENDS 
