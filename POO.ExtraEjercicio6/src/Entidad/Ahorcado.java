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
public class Ahorcado {
    private String[] buscarPalabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    
    public Ahorcado(){
    }
    
    public Ahorcado(String[] buscarPalabra, int letrasEncontradas, int jugadasMaximas){
        this.buscarPalabra = buscarPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public String[] getBuscarPalabra() {
        return buscarPalabra;
    }

    public void setBuscarPalabra(String[] buscarPalabra) {
        this.buscarPalabra = buscarPalabra;
    }
    
    public int getLetrasEncontradas(){
        return letrasEncontradas;
    }
    
    public void setLetrasEncontradas(int letrasEncontradas){
        this.letrasEncontradas = letrasEncontradas;
    }
    
    public int getJugadasMaximas(){
        return jugadasMaximas;
    }
    
    public void setJugadasMaximas(int jugadasMaximas){
        this.jugadasMaximas = jugadasMaximas;
    }
   
}
