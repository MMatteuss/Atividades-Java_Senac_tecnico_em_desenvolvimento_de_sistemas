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
public class Atividade1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        /*
        int alfa = 150;
        int beta = 350;
        */

        int convidados;
        
        System.out.println("Digite o número de convidados: ");
        convidados = leia.nextInt();
        
        if(convidados > 350 || convidados <=0){
            System.out.println("Número de convidados inválido");
        }else if(convidados>0 && convidados<=220){
            System.out.println("Uso do audiotorio Alfa");
            System.out.println("Inclua mais "+ ((convidados-150)-70) +" cadeiras");
        }else{
            System.out.println("Uso do audiotorio Beta");
        }
    }
    
}
