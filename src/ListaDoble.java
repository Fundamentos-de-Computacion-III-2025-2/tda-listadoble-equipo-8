public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble TODO @Rodriguez Andrade Denise
    public void insertarInicio(int dato){


    }

    //Metodo para insertar al Final de la lista doble TODO @Leyva Silva Andres Jovany
    public void insertarFinal(int dato){

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final   */
    // Martínez Ruiz Josué Ignacio
    public void insertarEnOrden(int dato) {
        if (listaVacia() || dato < inicio.dato) {
            insertarInicio(dato); //si está vacio seria lo mismo que insertarInicio, o si el dato debe ir en inicio
        } else { //si hay datos, se ocupa recorrer la lista hasta encontrar un número mayor e insertarlo antes de él
            NodoDoble actual = inicio; // actual.anterior = null y actual.siguiente = nextNodo (puede ser null si es 1 elemento)

            while (actual.siguiente != null && actual.siguiente.dato < dato) { //recorre hasta que llegue al final (null) o hasta que el dato siguiente sea mayor
                actual = actual.siguiente;

            }
            //actual.siguiente puede ser null (fin) o puede apuntar al nodo con dato mayor
            actual.siguiente = new NodoDoble(dato, actual.siguiente, actual);

            //actualizar el nodo anterior del que era el actual.siguiente (el posterior al nodo nuevo {actual.siguiente.siguiente})
            //verifica si el nodo posterior no es null (si es null, no se ocupa actualizar el nodo anterior)
            if (actual.siguiente.siguiente != null) {
                actual.siguiente.siguiente.anterior = actual.siguiente;
            }else{ //si el siguiente al posterior es null, significa que el posterior va ser el fin
                fin = actual.siguiente;
            }
        }
    }


    //Eliminar al inicio TODO @Leyva Silva Andres Jovany
    public int eliminarInicio(){

        return -1;
    }

    //Eliminar al final - Martínez Ruiz Josué Ignacio
    public int eliminarFinal() {
        int elemento = -1;
        if (!listaVacia()) { //la lista tiene al menos un elemento
            elemento = fin.dato;
            if (inicio == fin) { //elimina al inicio
                eliminarInicio();
            } else { //elimina al final
                fin.anterior.siguiente = null;
                fin = fin.anterior;
            }
        }
        return elemento;
    }

    //Eliminar un elemento TODO @Ortega Molina Marco Sebastian
    public int eliminarElemento(int elemento){

        return elemento;
    }

    //Metodo para buscar un elemento TODO @Ortega Molina Marco Sebastian
    public boolean buscarElemento(int elemento){

        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin TODO @Ibarra Padilla Sebastian
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio TODO @Ibarra Padilla Sebastian
    public void mostrarFinInicio(){

    }


}