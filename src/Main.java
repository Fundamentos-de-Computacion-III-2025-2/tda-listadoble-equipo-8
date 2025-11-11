import javax.swing.*;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+
                "2. Insertar un elemento al final\n"+
                "3. Insertar un elemento en orden\n"+
                "4. Eliminar un elemento al inicio\n"+
                "5. Eliminar un elemento al final\n"+
                "6. Eliminar un elemento\n"+
                "7. Buscar un elemento\n"+
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+
                "10. Salir\n","Menú de opciones",3));
        */
        public static void main(String[] args) {

            int opcion = 0;
            int elemento;
            ListaDoble lista = new ListaDoble();

            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento al inicio\n"+ //TODO @Rodriguez Andrade Denise
                                    "2. Insertar un elemento al final\n"+ //TODO @Leyva Silva Andres Jovany
                                    "3. Insertar un elemento en orden\n"+ //TODO @Martínez Ruiz Josué Ignacio
                                    "4. Eliminar un elemento al inicio\n"+ //TODO @Leyva Silva Andres Jovany
                                    "5. Eliminar un elemento al final\n"+ //TODO @Martínez Ruiz Josué Ignacio
                                    "6. Eliminar un elemento\n"+ //TODO @Ortega Molina Marco Sebastian
                                    "7. Buscar un elemento\n"+ //TODO @Ortega Molina Marco Sebastian
                                    "8. Mostrar los datos de inicio a fin\n"+ //TODO @Ibarra Padilla Sebastian
                                    "9. Mostrar los datos de fin a inicio\n"+ //TODO @Ibarra Padilla Sebastian
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1: //Insertar un elemento al inicio TODO @Rodriguez Andrade Denise
                            break;
                        case 2://Insertar un elemento al final TODO @Leyva Silva Andres Jovany
                            break;
                        case 3: //Insertar en orden TODO @Martínez Ruiz Josué Ignacio
                            break;
                        case 4:
                            Integer elementoEliminado = lista.eliminarInicio();

                            if (elementoEliminado != null) {

                                JOptionPane.showMessageDialog(null, "Elemento " + elementoEliminado + " eliminado del inicio.",
                                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista está vacía. No se pudo eliminar.",
                                        "Error", JOptionPane.ERROR_MESSAGE); // O WARNING_MESSAGE
                            }

                            break;
                        case 5: //Eliminar al final TODO @Martínez Ruiz Josué Ignacio
                            break;
                        case 6: //Eliminar TODO @Ortega Molina Marco Sebastian
                            break;
                        case 7: //Buscar elemento TODO @Ortega Molina Marco Sebastian
                            break;
                        case 8: //MostrarLista TODO @Ibarra Padilla Sebastian
                            lista.mostrarInicioFin();
                            break;
                        case 9: //MostrarLista TODO @Ibarra Padilla Sebastian
                            lista.mostrarFinInicio();
                            break;
                        case 10: //Salir
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion != 10);
    }
}