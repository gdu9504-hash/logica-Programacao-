/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author DanielCardoso
 */
public class Exemplo1 {
    public static void main(String[] args) {
        double altura, peso, imc;
        String nome ;
        Scanner entradaNumero = new Scanner (System.in);
        Scanner entradaTexto = new  Scanner (System.in);
        
        
        System.out.println("Digite seu nome:");
    nome = entradaTexto.nextLine();
     System.out.println("Digite sua altura");
     altura = entradaNumero.nextDouble();
     System.out.println("Digite sua peso");
     peso = entradaNumero.nextDouble();
     
     
         imc=peso/ (altura*altura);
         
         if(imc<16.9){
         System.out.println("Muito abaixo do peso!");
    }if (imc>=17 && imc<=18.4) {
         System.out.println("Abaixo do peso!");
    } if (imc>=18.5 && imc<=24.9){
         System.out.println("Peso normal!");
    } 
    
        
         
         
         
         
         
         
         
    }
    
}
