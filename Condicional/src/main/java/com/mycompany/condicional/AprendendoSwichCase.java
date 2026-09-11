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
public class AprendendoSwichCase {
    public static void main(String[] args) {
        
        // sistemas de agendamentos de serviços de Pet 
        String nomepet, racaPet;
        int idadePet, opcaodeservico;
        
        
        
       Scanner entradaTexto = new Scanner (System.in);
       Scanner entradaNumero = new Scanner (System.in);
        
       // solicitar os dados 
        System.out.println("Ola, para iniciarmos digite o nome do pet");
        nomepet = entradaTexto.nextLine();
        System.out.println("Bem vindo (a)"+nomepet+", qual a sua raca," );
        racaPet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos sua raca, "
         + "nos diga a sua idade");
        idadePet = entradaNumero.nextInt();
        System.out.println("Escolha um de nossos servicos");
        System.out.println("1- Tosa \n2-Banho \n3-Banho e Tosa \n4-Veterinario ");
        opcaodeservico = entradaNumero.nextInt();
        // analisando serviço como swich Case
         
       switch (opcaodeservico){
           case 1:
               System.out.println(nomepet+" voce possui "+idadePet+
                       " anos de idade, e da raca "+racaPet+
                       " e escolheu o servico Banho.");
      break;
           case 2:
     System.out.println(nomepet+" voce possui "+idadePet+
                       " anos de idade, e da raca "+racaPet+
                       " e escolheu o servico Banho.");
     break;
      case 3:
      System.out.println(nomepet+" voce possui "+idadePet+
                       " anos de idade, e da raca "+racaPet+
                       " e escolheu o servico Banho e Tosa.");
      break;
      case 4:
      System.out.println(nomepet+" voce possui "+idadePet+
                       " anos de idade, e da raca "+racaPet+
                       " e escolheu o servico Tosa.");
      
      break;
      default:    
          
          
          System.out.println("A opcao escolhida é invalida!");
    
       }
           
  }// fim da switch case 

    
}
