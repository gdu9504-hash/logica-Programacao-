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
public class DesafioSwitchcase {
    public static void main(String[] args) {
   // atendimento da lanchonete       
 
   int numeroProduto,quantidade; 
   double valorTotal;
           
  Scanner entradaNumero = new Scanner (System.in);
    //solicitar os dados 
        System.out.println("========LANCHONETE============");     
System.out.println("1 - Cachorro-quente R$ 10,00\n2 - X-Salada R$ 15,00\n3 - X-Bacon R$ 18,00\n4 - Refrigerante R$ 6,00\n5 - Suco R$ 7,00");

System.out.print("Digite o numero do produto: ");
numeroProduto = entradaNumero.nextInt();

System.out.print("Digite a quantidade: ");
quantidade = entradaNumero.nextInt();


     switch(numeroProduto){
         case 1: 
            valorTotal= 15*quantidade;
            System.out.println("===========Pedido==========");
            System.out.println("Produto:Pizza \nQuantidades:"+quantidade+"\nPreco unitario: R$25,00\n"+"valor total:"+valorTotal);
     
     break;
         case 2:
              valorTotal= 25*quantidade;
            System.out.println("===========Pedido==========");
            System.out.println("Produto:Pizza\nQuantidade: "+quantidade+"\nPreco unitario: R$25,00\n"+valorTotal);
        break;
         case 3 :
              valorTotal= 12*quantidade;
            System.out.println("===========Pedido==========");
             System.out.println("Produto:Cachorro-quante\nQuantidade: "+quantidade+"\nPreco unitario: R$25,00\n"+valorTotal);
        break;
        default:
        System.out.println("===========Pedido==========");
        
        
     break;
            
            
            
            
            
     }
       
    
    
    
        
    
    
    
    
    
    
    
    }
           
}
