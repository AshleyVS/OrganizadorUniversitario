
package organizadoruniversitario.principal;


public class Curso {
    String nombre, profesor, grupo;
    String horario;
    double precio;
    int codigoCarrera, codigoCurso; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    private void parse(String fila){
        String[] valores = fila.split(",");
            this.codigoCarrera = Integer.parseInt(valores[0]);
            this.codigoCurso = Integer.parseInt(valores[1]);
            this.nombre = valores [2];
            this.profesor = valores[3];
            this.horario = valores [4];
            this.grupo = valores [5];
            this.precio = Integer.parseInt(valores[6]);
         } // PARSE ENDS
    
    public Curso(String csv){
        this.parse(csv);
    } // CURSO ENDS 
    
} // CURSO ENDS 
