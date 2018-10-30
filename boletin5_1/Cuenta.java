/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 * Este ejercicio sirve para añadir, quitar y trnasferir dinero en una cuenta bancaria.
 * @author fojomars
 * @version 1.0
 * @see http://www.github.com/fojomars
 * @since 2018
 */
public class Cuenta {
    //Variables
    private String nome;
    private String numConta;
    private double saldo;
    
    //Constructor por defecto
    public Cuenta(){
    }
    
    //Constructor con parámetros
    public Cuenta(String nome, String nConta, double saldo){
        this.nome = nome;
        numConta = nConta;
        this.saldo = saldo;
    }
    
    //Métodos set y get de nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    //Métodos set y get de número de conta
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }
    
    public String getNumConta(){
        return numConta;
    }
    
    //Métodos set y get de saldo
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //Métodos de ingreso
    public boolean ingresar(double cantIngresar){
        boolean comprobacion;
        if(cantIngresar>0){
            saldo += cantIngresar;
            comprobacion = true;
        }
        else{
            System.out.println("x");
            comprobacion = false;
        }
        return comprobacion;
    }
    
    
    //Método de reintegro
    public boolean reintrego(double cantReintegro){
        boolean comprobacion;
        if(cantReintegro>0){
        saldo -= cantReintegro;
        comprobacion = true;
        }
        else{
            System.out.println("No hay dinero en la cuenta.");
            comprobacion = false;
        }
        return comprobacion;
    }
    
    public void mostrar(){
        System.out.println("Nombre cliente: " + nome + "\nNúmero de cuenta: "+ numConta + "\nSaldo: " + saldo
        );
    }
    
    //Método transferencia
    public void transferencia(String cuentaDestino, double saldo){
        
    }
    
    
}
