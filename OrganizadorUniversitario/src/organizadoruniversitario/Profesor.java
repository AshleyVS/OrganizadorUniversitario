
package organizadoruniversitario;


public class Profesor {
    String nombre;
    int codigoCurso, CodigoCarrera;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getCodigoCarrera() {
        return CodigoCarrera;
    }

    public void setCodigoCarrera(int CodigoCarrera) {
        this.CodigoCarrera = CodigoCarrera;
    }
    private void parse(String fila){
        String[] valores = fila.split(",");
        this.CodigoCarrera = Integer.parseInt(valores[0]);
        this.codigoCurso = Integer.parseInt(valores[1]);
        this.nombre = valores [2]; 
    
    } // PARSE ENDS
    
    public Profesor(String csv){
        this.parse(csv);
    }
    
    
}
