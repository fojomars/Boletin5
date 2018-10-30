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
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Añadir Cuentas 
        Cuenta obxCuenta1 = new Cuenta("Lucas","6681",150);
        Cuenta obxCuenta2 = new Cuenta("Sergio","1367",1000);
        
        //Mostrar cuentas
        obxCuenta1.mostrar();
        obxCuenta2.mostrar();
        
        //Añadir y quitar dinero de la primera cuenta
        obxCuenta1.ingresar(50);
        System.out.println("La cantidad de dinero después de ingresar en la cuenta " + obxCuenta1.getNumConta() + " es: " +obxCuenta1.getSaldo());
        obxCuenta1.reintrego(100); 
        System.out.println("La cantidad de dinero después de retirar en la cuenta " + obxCuenta1.getNumConta() + " es: " +obxCuenta1.getSaldo());
        
        //Añadir y quitar dinero de la segunda cuenta
        obxCuenta2.ingresar(500);
        System.out.println("La cantidad de dinero después de ingresar en la cuenta" + obxCuenta2.getNumConta() + " es: " +obxCuenta2.getSaldo());
        obxCuenta2.reintrego(250);
        System.out.println("La cantidad de dinero después de retirar en la cuenta" + obxCuenta2.getNumConta() + " es: " +obxCuenta2.getSaldo());
        
        //Hacer transferencia
        obxCuenta1.transferencia(obxCuenta2, 50);
        System.out.println("El dinero de la cuenta " + obxCuenta1.getNumConta() + " después de la transferencia es: " + obxCuenta1.getSaldo());
        System.out.println("El dinero de la cuenta " + obxCuenta2.getNumConta() + " después de la transferencia es: " + obxCuenta2.getSaldo());
    }
    
}
