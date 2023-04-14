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
public class Matematica {
    private double num1;
    private double num2;
    
    public Matematica(){
    }
    
    public Matematica(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double getNum1(){
        return num1;
    }
    
    public void setNum1(double num1){
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor(double num1, double num2) {
        double mayor = Math.max(num1, num2);
        System.out.println("El número mayor es: " + mayor);
    }

    public void calcularPotencia(double num1, double num2) {
        double mayor = Math.max(num1, num2);
        double menor = Math.min(num1, num2);
        System.out.println("la potencia del mayor elevado al menor es: " + Math.pow(mayor, menor));
    }

    public void raizCuadrada(double num1, double num2) {
        double menor = Math.abs(Math.min(num1, num2));
        System.out.println("La raíz cuadrada del número menor es: " + Math.sqrt(menor));
    }

    
}
