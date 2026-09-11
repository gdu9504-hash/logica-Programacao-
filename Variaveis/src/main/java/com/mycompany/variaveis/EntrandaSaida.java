/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author DanielCardoso
 */
public class EntrandaSaida {
    
    public static void main(String[] args) {
        
        // codigo para cadastrar o pet 
        // variaveis declaradas sem dados 
        String nome; 
        String raca;
        int idade; 
        double peso;
        boolean foivacinado;
        
        // criando as váriaveis de captura de dados 
        Scanner entradaTexto = new Scanner (System.in);
        Scanner entradaNumero= new Scanner (System.in);
        Scanner entradaLogica= new Scanner (System.in);
        
        System.out.println("Digite o nome do seu pet");
        nome= entradaTexto.nextLine();
               
        System.out.println ("Digite a raça do seu pet");
        raca = entradaTexto.nextLine();
               
        System.out.println("Digite a idade do seu pet");
        idade= entradaNumero.nextInt();
        
        System.out.println("Digite o peso do seu pet");
        peso= entradaNumero.nextDouble();
        
        System.out.println("seun pet foi vacinado? digite true para sim, ou false para não");
        foivacinado= entradaLogica.hasNextBoolean();
        
        System.out.println("Bem vindo(a) "+nome);
        System.out.println("Voce e da raca "+raca+" e tem "+idade+" anos");
        System.out.println("Seu dono informou que seu peso e "+peso+"kg");
        System.out.println("E que seu status de vacina e "+foivacinado);
        
        
        
        
        
        
        
        
        
        
        
    } // fim da main 
    
}// da classe EntradaSaida 

