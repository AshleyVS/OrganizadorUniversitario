
package organizadoruniversitario.principal;

public class Horario {
    String codigoCurso, profesores, aula;
    int codigoCarrera; 
    //Se llama a la clase profesor

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }
   
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoDeCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getProfesores() {
        return profesores;
    }

    public void setProfesores(String profesores) {
        this.profesores = profesores;
    }
    
    private void parse(String fila){
        try{
        String[] valores = fila.split(",");
        this.codigoCarrera = Integer.parseInt(valores[0]);
        this.codigoCurso = valores [1];
        this.profesores = valores [2]; 
        this.aula = valores[3];
        } // TRY ENDS 
        catch(Exception e){
            System.out.println("Error leyendo curso: " + this.codigoCurso + " y carrera: " + this.codigoCarrera);
        } // CATCH ENDS 
    
    } // PARSE ENDS
    
    public Horario(String csv){
        this.parse(csv);
    } // HORARIOS ENDS 

} // HORARIO ENDS 

