package organizadoruniversitario.csv;
/**
 * Esto no se debe cambiar
 * @author Alejandra Álvarez
 */
public class VectorElastico {

    private String[] vector;
    private int cantidadElementos;
    
    public VectorElastico(){
        this.cantidadElementos = 0;
    } // CONSTRUCTOR ---------------------------------------------------------- //

    public int length(){
        return cantidadElementos;
    }
    
    public String get(int i){
        return this.vector[i];
    }

    public void agregar(String str){
        
        if(vector == null){
            vector = new String[1];
            vector[0] = str;
        } // IF ENDS
        else{
            // Si llegamos aquí, es porque el vector sí tiene elementos 
            
            // Creamos un nuevo vector que tiene la cantidad de elementos 
            // que tenía el anterior + 1 ya que ocupamos crear un espacio 
            // para el nuevo elemento.
            
            String[] nuevo = new String[vector.length + 1];
            
            // Ahora copiamos todos los elementos que estaban en el vector
            // anterior
            for(int i = 0; i < vector.length; ++i){
                nuevo[i] = vector[i];
            } // FOR ENDS
            
            // En la última posición del vector se guarda el nuevo elemento.
            nuevo[nuevo.length - 1] = str;
            
            // Al final tenemos que reemplazar el vector viejo con el vector 
            // nuevo para que el vector nuevo sea el vector interno.
            this.vector = nuevo;
            this.cantidadElementos++;
        } // ELSE ENDS 
    } // METODO AGREGAR ------------------------------------------------------- //

    public String toString(){
        String resultado = "";
        for(int i = 0; i < vector.length; i++){
            resultado += vector[i] + "\n";
        } // FOR ENDS 
        return resultado;
    } // TO STRING ENDS ------------------------------------------------------- //
    
} // VECTOR ELASTICO ENDS 
