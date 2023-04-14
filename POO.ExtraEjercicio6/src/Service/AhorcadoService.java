/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    Ahorcado ahorcado = new Ahorcado();
    char x;

    public Ahorcado crearJuego() {
        System.out.println("JUEGO AHORCADO");
        System.out.println("Ingrese la palabra a buscar:");
        ahorcado.setBuscarPalabra(leer.next().split(""));
        System.out.println("Ingrese la cantidad de jugadas máximas:");
        ahorcado.setJugadasMaximas(leer.nextInt());
        ahorcado.setLetrasEncontradas(0);
        return ahorcado;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra que se debe buscar es: " + ahorcado.getBuscarPalabra().length);
    }

    public void buscar() {
        System.out.println("Ingrese la letra que piensa encontrar en la palabra:");
        x = leer.next().charAt(0);
        int cont = 0, longitud = ahorcado.getBuscarPalabra().length;
        for (int i = 0; i < longitud; i++) {
            if (x == ahorcado.getBuscarPalabra()[i].charAt(0)) {
                System.out.println("La letra " + x + " está ubicada en la posición " + (i + 1) + " de la palabra");
                cont++;
            }
        }
    }

    public void encontradas() {
        boolean valor = true;
        int cont = 0, longitud = ahorcado.getBuscarPalabra().length;
        for (int i = 0; i < longitud; i++) {
            if (x == ahorcado.getBuscarPalabra()[i].charAt(0)) {
                cont++;
            }
        }
        ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + cont);
        if (cont == 0) {
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);
            valor = false;
        }

        System.out.println("¿La letra " + x + " está contenida en la palabra?: " + valor);
        System.out.println("La letra " + x + " ha sido encontrada " + cont + " veces");
        System.out.println("Faltan encontrar " + (longitud - ahorcado.getLetrasEncontradas()) + " letras");
    }

    public void intentos() {
        System.out.println("Te guedan " + ahorcado.getJugadasMaximas() + " intentos");
    }

    public Ahorcado jugar() {
        crearJuego();
        longitud();
        do {
            buscar();
            encontradas();
            intentos();
            if (ahorcado.getBuscarPalabra().length == ahorcado.getLetrasEncontradas()) {
                System.out.println("¡Felicidades! Descubrió toda la palabra");
            }
            if (ahorcado.getJugadasMaximas() == 0) {
                System.out.println("¡Perdiste! Te quedaste sin intentos");
            }

        } while (ahorcado.getBuscarPalabra().length != ahorcado.getLetrasEncontradas() && ahorcado.getJugadasMaximas() != 0);
        System.out.println("");
        return ahorcado;
    }
}
