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
                            "1. Insertar un elemento al inicio\n"+
                                    "2. Insertar un elemento al final\n"+ //TODO @Leyva Silva Andres Jovany
                                    "3. Insertar un elemento en orden\n"+ //TODO @Martínez Ruiz Josué Ignacio
                                    "4. Eliminar un elemento al inicio\n"+ //TODO Leyva Silva Andres Jovany
                                    "5. Eliminar un elemento al final\n"+ //TODO @Martínez Ruiz Josué Ignacio
                                    "6. Eliminar un elemento\n"+ //TODO @Ortega Molina Marco Sebastian
                                    "7. Buscar un elemento\n"+ //TODO @Ortega Molina Marco Sebastian
                                    "8. Mostrar los datos de inicio a fin\n"+ //TODO @Ibarra Padilla Sebastian
                                    "9. Mostrar los datos de fin a inicio\n"+ //TODO @Ibarra Padilla Sebastian
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1://Insertar un elemento al inicio
                            try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar al inicio:", "Insertar al Inicio", JOptionPane.QUESTION_MESSAGE));
                            lista.insertarInicio(elemento);
                            JOptionPane.showMessageDialog(null, "Elemento " + elemento + " insertado al inicio.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
                        }
                            break;
                        case 2://Insertar un elemento al final // Leyva Silva Andres Jovany
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar al final:", "Insertar al Inicio", JOptionPane.QUESTION_MESSAGE));
                                lista.insertarFinal(elemento);
                                JOptionPane.showMessageDialog(null, "Elemento " + elemento + " insertado al final.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            } catch (NumberFormatException n) {
                                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case 3: //Insertar en orden - Martínez Ruiz Josué Ignacio
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento: ",
                                        "Insertar en Orden: ", 3));
                                lista.insertarEnOrden(elemento);
                            } catch (NumberFormatException n) {
                                JOptionPane.showMessageDialog(null, "Error" + n.getMessage(), "Error de ingreso", 0);
                            }
                            break;
                        case 4: // Leyva Silva Andres Jovany
                            Integer elementoEliminado = lista.eliminarInicio();


                                JOptionPane.showMessageDialog(null, "Elemento " + elementoEliminado + " eliminado del inicio.",
                                        "Éxito", JOptionPane.INFORMATION_MESSAGE);


                            break;
                        case 5: //Eliminar al final - Martínez Ruiz Josué Ignacio
                            elemento = lista.eliminarFinal();
                            JOptionPane.showMessageDialog(null, "Se eliminó al elemento " + elemento, "Eliminar elemento al Final ", 1);
                            break;
                        case 6: //Eliminar  Molina Marco Sebastian
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar:", "Eliminar Elemento", JOptionPane.QUESTION_MESSAGE));
                                int Elementoeliminado = lista.eliminarElemento(elemento);

                                if (Elementoeliminado != -1) {
                                    JOptionPane.showMessageDialog(null, "Elemento " + Elementoeliminado + " eliminado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Elemento " + elemento + " no encontrado en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (NumberFormatException n) {
                                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case 7: //Buscar elemento  Molina Marco Sebastian
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a buscar:", "Buscar Elemento", JOptionPane.QUESTION_MESSAGE));
                                boolean encontrado = lista.buscarElemento(elemento);

                                if (encontrado) {
                                    JOptionPane.showMessageDialog(null, "Elemento " + elemento + " SÍ se encuentra en la lista.", "Encontrado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Elemento " + elemento + " NO se encuentra en la lista.", "No Encontrado", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } catch (NumberFormatException n) {
                                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case 8: //MostrarLista - Ibarra Padilla Sebastian
                            lista.mostrarInicioFin();
                            break;
                        case 9: //MostrarLista - Ibarra Padilla Sebastian
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