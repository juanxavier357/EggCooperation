/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class CursoService {

    Scanner leer = new Scanner(System.in);
    Curso curso = new Curso();

    public Curso cargarAlumnos() {
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            array[i] = leer.next();
        }
        curso.setAlumnos(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Los 5 alumnos son: " + curso.getAlumnos()[i] + " "); 
        }
        System.out.println("");
        return curso;
    }
    
    public Curso crearCurso() {
        System.out.println("PROGRAMA PARA CURSO DE 5 ALUMNOS");
        System.out.println("Ingrese el nombre del curso:");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día:");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días por semana:");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno: mañana - tarde");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora:");
        curso.setPrecioPorHora(leer.nextDouble());
        System.out.println("Ingrese el nombre de los 5 alumnos:");
        cargarAlumnos();
        return curso;
    }

    public void calcularGananciaSemanal(){
        double ganancia = curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getCantidadDiasPorSemana()*5;
        System.out.println("La ganancia por semana es: " + ganancia);
    }
}
