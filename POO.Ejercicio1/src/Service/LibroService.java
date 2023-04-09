/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class LibroService {
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        
    public Libro datosUsuario(){
        System.out.println("DATOS DE USUARIO");
        System.out.println("Ingrese el número de ISBN:");
        libro.ISBN = leer.nextInt();
        System.out.println("Ingrese el título del libro:");
        leer.nextLine();
        libro.Titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        libro.Autor = leer.nextLine();
        System.out.println("Ingrese el número de páginas:");
        libro.numeroPaginas = leer.nextInt();
        return libro;
    }
    
    public void informeUsuario(Libro libro){
        System.out.println("INFORME DE USUARIO");
        System.out.println("ISBN: " + libro.ISBN);
        System.out.println("Título: " + libro.Titulo);
        System.out.println("Autor: " + libro.Autor);
        System.out.println("Número de páginas: " + libro.numeroPaginas);
    }
    
}
