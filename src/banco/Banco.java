/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        datosCuenta cuenta = new datosCuenta();
        cuenta.setName("Josue");
        cuenta.setSaldo(56.56);
        Scanner entra = new Scanner(System.in);

        cuenta.menu();




    }
    
}
