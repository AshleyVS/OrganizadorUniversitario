
package organizadoruniversitario.principal;


public class Matricula {
    
    private String nombre, cedula, carrera, curso, CodigoCurso, profesores, aula, cuatrimestre;

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    private int CodigoCarrera; 

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(String CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public int getCodigoCarrera() {
        return CodigoCarrera;
    }

    public void setCodigoCarrera(int CodigoCarrera) {
        this.CodigoCarrera = CodigoCarrera;
    }  
       
    
    public String getProferores(){
    return profesores; 
    }
    
    public void setProfesores (String profesores){
        this.profesores = profesores; 
    }
    
    public String getAula(){
    return aula; 
    }
    
    public void setAula (String Aula){
        this.aula = aula; 
    }
    
}
