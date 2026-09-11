/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author DanielCardoso
 */

public class Condicional {

    public static void main(String[] args) {     
    
    /*Condicional é o codigo utilizado para avaliar dados, 
     e se for verdadeiro raliza uma ação,
     e se for falso realiza outrs ação.  
      SE - IF
      SENÃO -ELSE
    */
    
    //váriavel
    int idade;
    
    //variavel de entranda de dados 
    Scanner entradaNumero = new Scanner (System.in);
    
    //solicitação para o usuário 
    System.out.println("Digite a sua idade:");
    idade = entradaNumero.nextInt();
    
    //análise de idade 
    if(idade>=18){
        System.out.println("você é maior de idade");
    }else{
        System.out.println("você é menor de idade");
    }// fim do else 
    
        
    }
    
 
      



    
}
