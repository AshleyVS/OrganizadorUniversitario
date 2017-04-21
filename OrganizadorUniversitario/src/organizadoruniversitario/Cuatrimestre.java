
package organizadoruniversitario;

public class Cuatrimestre {
    String codigoCurso, curso;
    int codigoCarrera; 
       
    public String codigoCurso() {
        return codigoCurso;
    }

    public void setcodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getcodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
            
    private void parse(String fila){
        String[] valores = fila.split(",");
        this.codigoCarrera = Integer.parseInt(valores[0]);
        this.codigoCurso = valores [1];
        this.curso = valores [2];     
    } // PARSE ENDS
    
    public Cuatrimestre(String csv){
        this.parse(csv);
    }

  
}
