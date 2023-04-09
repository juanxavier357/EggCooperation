/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author free
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int numeroPaginas;

    public Libro(int ISBN, String Titulo, String Autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }
}
