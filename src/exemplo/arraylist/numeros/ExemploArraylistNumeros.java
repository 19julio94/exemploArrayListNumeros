
package exemplo.arraylist.numeros;

import java.util.ArrayList;

/**
 *
 * @author jpatriciodasilva
 */
public class ExemploArraylistNumeros {

  
    public static void main(String[] args) {
    
        
        
        
       Numeros num= new Numeros();
       num.engadirElementos();
       num.amosarLista();
    //engadir 1 elemento
       
       num.engadirUnElemento(10);
       num.amosarLista();
       num.engadirElementoDous(3,1);
       num.amosarLista();
       num.eliminarElemento(1);
       num.amosarLista();
       num.ordenar();
       num.amosarLista();
       
       
       
}
}
