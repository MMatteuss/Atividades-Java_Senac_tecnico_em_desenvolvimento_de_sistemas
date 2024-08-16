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
public class Questao1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int convidados;
        
        System.out.print("Digite o numero de convidados: ");
        convidados = leia.nextInt();
        
        if(convidados > 350 || convidados <=0){
            System.out.println("Numero de convidados invalido");
        }else if(convidados>0 && convidados<=220){
            System.out.println("Use o auditorio Alfa");
            System.out.println("Inclua mais "+ (convidados-150) +" cadeiras");
        }else{
            System.out.println("Use o auditorio Beta");
        }
    }
    
}
