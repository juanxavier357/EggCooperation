/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in);
    Cadena cadena = new Cadena();

    public Cadena crearCadena() {
        System.out.println("PROGRAMA DE FRASE");
        System.out.println("Ingrese la frase:");
        cadena.setFrase(leer.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public int mostrarVocales() {
        int vocales = 0;
        String[] caracteres = cadena.getFrase().split("");
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if ("a".equalsIgnoreCase(caracteres[i]) || "e".equalsIgnoreCase(caracteres[i]) || "i".equalsIgnoreCase(caracteres[i])
                    || "o".equalsIgnoreCase(caracteres[i]) || "u".equalsIgnoreCase(caracteres[i])) {
                vocales++;
            }
        }
        return vocales;
    }

    public String invertirFrase() {
        String[] caracteres = cadena.getFrase().split("");
        String nuevaCadena = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            nuevaCadena += caracteres[i];
        }
        return nuevaCadena;
    }

    public int vecesRepetido() {
        int veces = 0;
        String[] caracteres = cadena.getFrase().split("");
        System.out.println("Ingrese la letra que desea contar en la frase:");
        String letra = leer.next();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(caracteres[i])) {
                veces++;
            }
        }
        return veces;
    }

    public void compararLongitud() {
        System.out.println("Ingrese la segunda frase para comparar:");
        leer.nextLine();
        String frase = leer.nextLine();
        if (cadena.getLongitud() > frase.length()) {
            System.out.println("La longitud de la primera frase es mayor a la segunda frase en:");
            System.out.println(cadena.getLongitud() - frase.length());
        } else if (cadena.getLongitud() == frase.length()) {
            System.out.println("La longitud de las frases son iguales a: ");
            System.out.println(cadena.getLongitud());
        } else {
            System.out.println("La longitud de la segunda frase es mayor a la primera frase en:");
            System.out.println(frase.length() - cadena.getLongitud());
        }
    }

    public void unirFrases() {
        System.out.println("Ingrese la frase que desea unir:");
        String frase = leer.nextLine();
        String union = cadena.getFrase() + " " + frase;
        System.out.println("La frase resultante es: " + union);
    }

    public void reemplazar() {
        String[] caracteres = cadena.getFrase().split("");
        String nuevaCadena = "";
        System.out.println("Ingrese la letra que desea reemplazar por la a:");
        String letra = leer.nextLine();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if ("a".equalsIgnoreCase(caracteres[i])) {
                nuevaCadena += letra;
            } else {
                nuevaCadena += caracteres[i];
            }
        }
        System.out.println("La frase resultante es: " + nuevaCadena);
    }
    
    public boolean contiene(){
        boolean valor;
        int cont = 0;
        String[] caracteres = cadena.getFrase().split("");
        System.out.println("Ingrese la letra que desea saber si contiene la frase:");
        String letra = leer.nextLine();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(caracteres[i])) {
                cont++;
            }  
        }
        if (cont > 0) {
            valor = true;
        } else {
            valor = false;
        }
        return valor;
    }

}
