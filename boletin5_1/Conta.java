/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 *
 * @author fojomars
 */
public class Conta {
    //Variables
    private String nome;
    private String numConta;
    private double saldo;
    
    //Constructor por defecto
    public Conta(){
    }
    
    //Constructor con parámetros
    public Conta(String nome, String nConta, double saldo){
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
    
    //Métodos de ingreso y reintegro
    public double ingresar(double cantIngresar){
        saldo += cantIngresar;
        return saldo;
    }
    
    public double reintrego(double cantReintegro){
        saldo -= cantReintegro;
        return saldo;
    }
    
    public void amosar(){
        System.out.println("Nombre cliente: " + nome + "\nNúmero de cuenta: "+ numConta + "\nSaldo: " + saldo
        );
    }
    
    //Método transferencia
    //public double transferencia(String cuentaDestino, double saldo){
        
    //}
    
    
}
