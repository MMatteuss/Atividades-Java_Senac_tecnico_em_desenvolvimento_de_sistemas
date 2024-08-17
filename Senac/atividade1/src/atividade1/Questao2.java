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
        
        System.out.print("Qual o nome do primeiro Cliente: ");
        nomeCliente1 = leia.nextLine();
        System.out.print("Qual a idade do " + nomeCliente1 + ": ");
        idadeCliente1 = leia.nextInt();
        leia.nextLine();  // Consome o caractere de nova linha
        //Quando você usa leia.nextInt();, ele lê apenas o número, mas não lê o "Enter" que você pressiona ao final da entrada. Esse "Enter" é um caractere especial chamado nova linha (\n). Esse caractere fica "sobrando" no buffer de entrada e, quando você chama leia.nextLine();, ele acaba lendo esse "Enter" ao invés de esperar pela próxima entrada do usuário.
       

        System.out.print("Qual o nome do segundo Cliente: ");
        nomeCliente2 = leia.nextLine();
        System.out.print("Qual a idade do " + nomeCliente2 + ": ");
        idadeCliente2 = leia.nextInt();
        
        System.out.println("--------------------------------");
        
        if(idadeCliente1 > idadeCliente2 && idadeCliente1 >=60){
            System.out.println("Quarto A: "+nomeCliente1+" com desconto de 40%");
            System.out.println("Quarto b: "+nomeCliente2);
        } else if(idadeCliente1 < idadeCliente2 && idadeCliente2 >=60){
            System.out.println("Quarto A: "+nomeCliente2+" com desconto de 40%");
            System.out.println("Quarto b: "+nomeCliente1);
        } else if(idadeCliente1 > idadeCliente2){
            System.out.println("Quarto A: "+nomeCliente1);
            System.out.println("Quarto b: "+nomeCliente2);
        }else if(idadeCliente1 < idadeCliente2){
            System.out.println("Quarto A: "+nomeCliente2);
            System.out.println("Quarto b: "+nomeCliente1);
        }
    }
}
