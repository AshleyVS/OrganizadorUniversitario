package organizadoruniversitario.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esto no se debe cambiar 
 */
public class LectorDeCSV {
    
    // Almacena la ruta completa hacia un archivo CSV
    String ubicacionDelArchivoCSV;
    
    
    public LectorDeCSV(final String ubicacionDelArchivoCSV){
        this.ubicacionDelArchivoCSV = ubicacionDelArchivoCSV;
    } // CONSTRUCTOR METHOD ENDS ----------------------------------------------- //
    
  
    public VectorElastico leer(){
        VectorElastico vs = new VectorElastico();
        BufferedReader br = null;
        String linea = "";
        try{
            // Esta linea lo que hace es abrir el archivo
            br = new BufferedReader(new FileReader(this.ubicacionDelArchivoCSV));
            while((linea = br.readLine()) != null){
                vs.agregar(linea);
            } // WHILE ENDS
        } // TRY 
        catch(Exception e){
            // Si hay un error lo que pongamos aca es lo que se va a ejecutar
        } // CATCH 
        finally{
            try {
                if (br !=null){
                    br.close();
                } // IF ENDS 
            } catch (IOException ex) {
                Logger.getLogger(LectorDeCSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // FINALLY ENDS
        return vs;
    } // METODO LEER ENDS ------------------------------------------------------ //
} // CLASS LECTOR DE CSV ENDS -------------------------------------------------- //
