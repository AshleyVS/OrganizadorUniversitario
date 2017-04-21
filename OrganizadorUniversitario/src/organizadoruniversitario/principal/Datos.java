
package organizadoruniversitario.principal;

import java.net.URL;
import organizadoruniversitario.Cuatrimestre;
import organizadoruniversitario.csv.LectorDeCSV;
import organizadoruniversitario.csv.VectorElastico;
import organizadoruniversitario.principal.Carrera;
import organizadoruniversitario.principal.Curso;
import organizadoruniversitario.principal.Horario;

public class Datos {
    
    private static final String ARCHIVO_CARRERA = "CARRERAS.csv";
    private static final String ARCHIVO_CURSOS = "CURSOS.csv";
    private static final String ARCHIVO_HORARIOS = "HORARIO.csv";
    
    private LectorDeCSV elLector;
    
   /**
    * Constructor
    */
    public Datos(){ 
        // Ahora se cargan todos los datos desde los archivos de una vez
   
        this.cargarCarreras();
        System.out.println("INFO: Se cargaron " + this.carreras.length + " carreras.");
        
        this.cargarCursos();
        System.out.println("INFO: Se cargaron " + this.cursos.length + " cursos.");
        
        this.cargarHorarios();
        System.out.println("INFO: Se cargaron " + this.horarios.length + " horarios.");
        
    } // DATOS ENDS 
    // ------------------------------------------------------------------------ //
    
    private Carrera[] carreras;

    public Carrera[] getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera[] carreras) {
        this.carreras = carreras;
    }
    
    /**
     * Obtiene el codigo de una carrera a partir del nombre del curso buscando 
     * en el vector de carreras. 
     * @param nombre
     * @return 
     */
    public int obtenerCodigoCarrera(String nombre){
        int codigo = -1;
        for(int i = 0; i < carreras.length; i++){
            if(carreras[i].getNombre().compareTo(nombre) == 0){
                codigo = carreras[i].getCodigoCarrera();
                break;
            }
        }
        return codigo;
    }
    
    /**
     * Obtiene un vector de cursos que corresponden a una carrera y un cuatrimestre
     * especifico
     * @param carrera
     * @param cuatri
     * @return 
     */
    public Curso[] obtenerCursosDeCarreraEnCuatri(String carrera, String cuatri){
        Curso[] cursosDeCarrera;
        int codigo = this.obtenerCodigoCarrera(carrera);
        if(codigo != -1){
            int cantidad = 0;
            
            // hay que contar cuantos cursos hay en ese cuatri
            for(int i = 0; i < this.cursos.length; i++){
                if(this.cursos[i].getCodigoCarrera() == codigo){
                    cantidad++;
                }
            }
            
            cursosDeCarrera = new Curso[cantidad];
            
            // se guardan en el vector de cursos de la carrera
            int cursoActual =0;
            for(int i = 0; i < this.cursos.length; i++){
                if(this.cursos[i].getCodigoCarrera() == codigo){
                    cursosDeCarrera[cursoActual] = this.cursos[i];
                    cursoActual++;
                }
            }
        }
        else{
            cursosDeCarrera = null;
        }
        return cursosDeCarrera;
    }
    
    /**
     * Aca se cargan las carreras desde el archivo CSV
     */
    private void cargarCarreras(){
        URL path = getClass().getResource(ARCHIVO_CARRERA);
        this.elLector = new LectorDeCSV(path.getPath());
        VectorElastico carrerasCsv = this.elLector.leer();
        this.carreras = new Carrera[carrerasCsv.length()];
        for(int i = 0; i < carrerasCsv.length() ; ++i){
            try{
                carreras[i] = new Carrera(carrerasCsv.get(i));
            }
            catch(Exception e){
                System.out.println("Error el leer carrera en línea [" + i + "]");
                System.out.println("Error: " + e.getMessage());
            } // CATCH ENDS
        } // FOR 
    } // FIN CARGAR CARRERAS -------------------------------------------------- //
    
    // ------------------------------------------------------------------------ //
    
    public Curso [] cursos; 
    
    public Curso [] getCursos(){
        return cursos; 
    }
    
    public void setCursos (Curso[] cursos){
        this.cursos = cursos; 
    } 
    
    private void cargarCursos(){
        URL path = getClass().getResource(ARCHIVO_CURSOS);
        this.elLector = new LectorDeCSV(path.getPath());
        VectorElastico cursosCsv = this.elLector.leer();
        this.cursos = new Curso[cursosCsv.length()];
        for(int i = 0; i < cursosCsv.length() ; ++i){
            try{
                cursos[i] = new Curso(cursosCsv.get(i));
            }
            catch(Exception e){
                System.out.println("Error el leer curso en línea [" + i + "]");
                System.out.println("Error: " + e.getMessage());
            } // CATCH ENDS
        } // FOR 
    } // FIN CARGAR CARRERAS -------------------------------------------------- //
    
    // ------------------------------------------------------------------------ //
    
    public Horario[] horarios; 
    
    public Horario[] getHorario(){
        return horarios; 
    }
    
    public void setHorarios (Horario[] horarios){
        this.horarios = horarios; 
    }
    
    private void cargarHorarios(){
        URL path = getClass().getResource(ARCHIVO_HORARIOS);
        this.elLector = new LectorDeCSV(path.getPath());
        VectorElastico horariosCsv = this.elLector.leer();
        this.horarios = new Horario[horariosCsv.length()];
        for(int i = 0; i < horariosCsv.length() ; ++i){
            try{
                horarios[i] = new Horario(horariosCsv.get(i));
            }
            catch(Exception e){
                System.out.println("Error el leer horario en línea [" + i + "]");
                System.out.println("Error: " + e.getMessage());
            } // CATCH ENDS
        } // FOR 
    } // FIN CARGAR CARRERAS -------------------------------------------------- //
 
} // DATOS ENDS 
