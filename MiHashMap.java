import java.util.ArrayList;
/**
 * Clase con los metodos mas usados de HashMap pero con int como
 * tipo de valor
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class MiHashMap
{
    private ArrayListInt valores;
    private ArrayList<String> claves;
   public MiHashMap(){
       valores = new ArrayListInt();
       claves = new ArrayList<>();
    }
   
   /**
    * Introduce un entero en el HashMap
    * 
    * @param clave Clave asociada al valor
    * @param valor Valor a introducir
    * 
    * @return devuelve el valor antiguo si ya existía y -1 si no
    */
   public int put(String clave, int valor){
       int result = -1;
       if(claves.size() != 0){
           if(claves.contains(clave)){
               result = valores.get(claves.indexOf(clave));
               valores.add(claves.indexOf(clave), valor);
            }
           else{
               claves.add(clave);
               valores.add(valor);
           }
        }
       else{
           claves.add(clave);
           valores.add(valor);
        }
       return result;
    }
    
   /**
    * Devuelve el valor asociado a una clave
    * 
    * @param clave Clave del valor buscado
    * 
    * @return devuelve el número buscado o -1 si no existe
    */
   public int get(String clave){
       int result;
       if(claves.isEmpty()){
           result = -1;
       }
       else if(claves.contains(clave)){
           result = valores.get(claves.indexOf(clave));
       }
       else{
           result = -1;
       }
       return result;
    }
   
   /**
    * Devuelve true si el HashMap esta vacío
    */
   public boolean isEmpty(){
       boolean empty = false;
       if(valores.isEmpty()){
           empty = true;
        }
       return empty;
    }
    
   /**
    * Devuelve el tamaño del HashMap
    */
   public int size(){
       return claves.size();
    }
    
   /**
    * Borra el valor asociado a una clave
    * 
    * @param clave Clave del valor buscado
    */
   public void remove(String clave){
       if(!claves.isEmpty()){
           if(claves.contains(clave)){
               valores.remove(claves.indexOf(clave));
               claves.remove(claves.indexOf(clave));
            }
        }
    }
    
   /**
    * Vacía el HashMap
    */
   public void clear(){
       claves.clear();
       valores.clear();
    }
    
   /**
    * Comprueba si una clave existe en el hashMap y devuelve true
    * o false
    * 
    * @param clave Clave buscada
    */
   public boolean containsKey(String clave){
       boolean found = false;
       if(!claves.isEmpty()){
           if(claves.contains(clave)){
               found = true;
            }
        }
       return found;
    }
    
   /**
    * Comprueva si un valor existe en el HashMap y devuelve true
    * o false
    * 
    * @param valor Valor buscado.
    */
   public boolean containsValue(int valor){
       boolean found = false;
       if(!valores.isEmpty()){
           if(valores.contains(valor)){
               found = true;
            }
        }
       return found;
    }
}
