/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        String nomeCliente1;
        String nomeCliente2;
        int idadeCliente1;
        int idadeCliente2;
        
        System.out.println("Qual o nome do primeiro Cliente: ");
        nomeCliente1 = leia.nextLine();
        System.out.println("Qual a idade do "+nomeCliente1+": ");
        idadeCliente1 = leia.nextInt();
        
        System.out.println("Qual o nome do segundo Cliente: ");
        nomeCliente2 = leia.nextLine();
        System.out.println("Qual a idade do "+nomeCliente2+": ");
        idadeCliente2 = leia.nextInt();
        
        if(idadeCliente1 < idadeCliente2){
            System.out.println("Quarto A:"+nomeCliente1);
            System.out.println("Quarto b:"+nomeCliente2);
        }
    }
}
