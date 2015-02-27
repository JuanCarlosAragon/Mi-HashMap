
/**
 * Clase con los metodos ArrayList mas usados pero para tipos de dato int
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class ArrayListInt
{
    private int[] array;
    /*
     * Constructor sin parametros
     */
   public ArrayListInt(){
       array = new int[0];
    }
   
    /*
     * Añade un elemento a la colección al final de la misma.
     */
   public void add(int elemento){
       int[] temp = new int[array.length + 1];
       int cont = 0;
       for(int num : array){
           temp[cont] = num;
           cont++;
        }
       temp[temp.length-1] = elemento;
       //Nuestro array temp ya tiene los elementos que queremos en nuestro array
       //Asique creamos en nuestra variable array un nuevo array del tamaño deseado y volcamos lo de temp
       array = temp;
       
    }
    
    /*
     * Añade un elemento a la colección en la posición especificada por el parámetro index.
     */
   public void add(int index, int elemento){
       int[] temp = new int[array.length + 1];
       int cont = 0;
       
       while(cont < temp.length){
           if(cont < index){
               //Aquí la descarga de datos es lineal
               temp[cont] = array[cont];
            }
           else if(cont == index){
               //Aquí el elemento a descargar es el nuevo elemento
               temp[cont] = elemento;
            }
           else{
               //Aquí la descarga de datos tiene un desfase de una posición
               temp[cont] = array[cont-1];
            }
           cont++;
        }
        //Ya tenemos un array temporal con los datos que queremos tener en el array definitivo
        array = temp;
    }
    
    /*
     * Vacia la colección
     */
   public void clear(){
       array = new int[0];
    }
    
   /*
    * devuelve true si la colección contiene ese elemento
   */
   public boolean contains(int elemento){
       boolean found = false;
       for(int num : array){
           if(num == elemento){
               found = true;
            }
        }
       return found;
   }
   /*
    * devuelve el elemento existente en la posición indicada
    */
   public int get(int index){
       int searched = -1;
       if(array.length != 0){
           try {
               searched = array[index];
            }
           catch(Exception e){
               System.out.println("El indice no es valido");
            }
        }
       return searched;
    }
    /*
     * Cambia el valor de el valor indicado en el indice indicado
     */
   public void set(int index, int elemento){
       array[index] = elemento;
    }
   /*
    * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1
    * en caso de que la colección no contenga el elemento especificado
    */
   public int indexOf(int elemento){
       int toReturn = -1;
       int cont = 0;
       for(int num : array){
           if(num == elemento){
               toReturn = cont;
            }
           cont++;
        }
        return toReturn;
    }
   /*
    * Devuelve true si la lista no contiene elementos
    */
   public boolean isEmpty(){
       return (array.length == 0);
    }
    /*
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho
     * elemento.
     */
   public int remove(int index){
       //Primero nos creamos un array temporal del tamaño que tendrá nuestro array definitivo
       int[] temp = new int[array.length -1];
       //Tambien nos creamos una variable donde guardar el numero a borrar
       int deleted = -1;
       //Vamos volcando el array en nuestro temporal y cuando llegamos al elemento a borrar lo pasamos a deleted y lo omitimos del copiado
       int cont = 0;
       while(cont < temp.length){
           if(cont < index){
               //Aquí el volcado es normal
               temp[cont] = array[cont];
            }
           else if(cont == index){
               //Aquí num es el elemento a borrar, lo pasamos a deleted y lo omitimos del copiado
               deleted = array[cont];
           }
           else{
               //Aquí el volcado tiene un desfase de una posición
               temp[cont-1] = array[cont];
            }
           cont++;
        }
        //Ahora ya tenemos nuestro array temporal, solo nos falta adaptar el tamaño del array definitivo y volcar lo de temp en el.
       array = temp;
        //Ya tenemos nuestro array listo de nuevo
       return deleted;
    }
   /*
    * Devuelve el número de elementos de la colección
    */
   public int size(){
       return array.length;
    }
}
