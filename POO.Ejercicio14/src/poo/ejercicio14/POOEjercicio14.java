/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio14;

import Entidad.Movil;
import Service.MovilService;

/**
14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que 
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda 
almacenar cada producto con su información. Crear una entidad Movil con los atributos 
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
correspondiente al código. A continuación, se implementarán los siguientes métodos: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo 
 * @author Juan Xavier
 */
public class POOEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MovilService ms = new MovilService();
        Movil movil = ms.cargarCelular();
        System.out.println("");
        System.out.print(movil);
        System.out.print("código = ");
        int[] array = movil.getCodigo();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    } 
}
