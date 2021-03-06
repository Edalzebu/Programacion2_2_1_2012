/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class CuentaBancaria {
    protected int codigo;
    protected String nombre;
    protected double saldo;
    protected Date fechaInicio;
    public static int PAGO_MINIMO = 500;
    
    public CuentaBancaria(int c, String n){
        codigo = c;
        nombre = n;
    }
    
    public double tasaInteres(){
        return 0.03;
    }
    
    public void deposito(double m){
        saldo += m;
    }
    
    public void retiro(double m){
        if( saldo > m )
            saldo -= m;
    }

    @Override
    public String toString() {
        String dato = codigo + "-" + nombre + " Lps." +saldo;
        return dato;
    }
    
    public void patito(){
        System.out.println("PATITO BANCARIO");
    }
  }
