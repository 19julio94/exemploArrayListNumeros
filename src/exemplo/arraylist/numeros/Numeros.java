package exemplo.arraylist.numeros;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jpatriciodasilva
 */
public class Numeros {

    ArrayList<Integer> listaNumeros = new ArrayList();

    public void engadirElementos() {

        listaNumeros.add(4);
        listaNumeros.add(2);
        listaNumeros.add(8);
        listaNumeros.add(6);

    }

    public void amosarLista() {
        for (int i = 0; i < listaNumeros.size(); i++) {

            System.out.println(listaNumeros.get(i));

        }

    }

    public void engadirUnElemento(int ele) {

        listaNumeros.add(ele);

    }
    
    public void engadirElementoDous(int elem,int pos){
    listaNumeros.add(pos,elem);
    
    
    
    
    }
    public void eliminarElemento(int posi){
        listaNumeros.remove(posi);
    
    
    }
    public void ordenar(){
    Collections.sort(listaNumeros);
    
    }
    
    //Como recibir e devolcer un arraylist
    
//    public ArrayList<Integer> metodo (ArrayList<Integer>lista){
//            return listaNumeros;
//    }
}
