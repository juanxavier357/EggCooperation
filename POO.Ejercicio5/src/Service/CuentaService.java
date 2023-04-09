/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class CuentaService {
    
    Scanner leer = new Scanner(System.in);
    Cuenta cuenta = new Cuenta();
    
    public Cuenta crearCuenta(){
        System.out.println("CUENTA BANCARIA");
        System.out.println("Ingrese su número de cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI:");
        cuenta.setDNI(leer.nextInt());
        System.out.println("Ingrese la cantidad a depositar:");
        cuenta.setSaldoActual(leer.nextInt());
        return cuenta;
    }
    
    public Cuenta Ingresar(){
        System.out.println("Ingrese una cantidad de dinero:");
        double ingreso = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        return cuenta;
    }
    
    public Cuenta Retirar(){
        System.out.println("Retire una cantidad de dinero:");
        double retiro = leer.nextDouble();
        if (cuenta.getSaldoActual() <= retiro) {
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
        return cuenta;
    }
    
    public Cuenta extraccionRapida(){
        System.out.println("Extrae una cantidad de dinero, no superior al 20% de su saldo actual:");
        double extraccion = leer.nextDouble();
        if (extraccion <= cuenta.getSaldoActual()*0.2) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - extraccion);
        } else {
            System.out.println("No se puede extraer la cantidad, porque supera al 20% de su saldo actual");
        }
        return cuenta;
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: S/." + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("DATOS DE USUARIO");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Número de DNI: " + cuenta.getDNI());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
    
}
