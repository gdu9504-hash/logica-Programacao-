/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticao;

import java.util.Scanner;

/**
 *
 * @author DanielCardoso
 */
public class Lacoderepeticao {

    public static void main(String[] args) {
     // prgrama para preencher lista de convidados 
    
    

        String[] listaConvidado = new String[20];

        Scanner entradaTexto = new Scanner(System.in);

        // solicitar que o dono da festa preencha a lista
        for (int cont = 0; cont < 20; cont++) {

            System.out.println("Digite o nome do convidado:");
            listaConvidado[cont] = entradaTexto.nextLine();

        }

        // imprimir a lista de convidados
       
        for (int cont = 0; cont < 20; cont++) {

            System.out.println("Convidado " + cont + ": " + listaConvidado[cont]);

        }
    }
}
       
       
  
  

