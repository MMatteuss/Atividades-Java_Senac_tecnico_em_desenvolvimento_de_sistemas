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
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in, "UTF-8");
        String nomeHospede;
        int idadeHospede;
        int valorHospedePagar = 0;
        int valorHospedePagarMeia=0;
        int valorHospedeNaoPagar =0;
        byte para = 0;
        
        while(para == 0){
            // Interação com o usuario (ok)
            System.out.print("Qual o nome do hospede: ");
            nomeHospede = leia.nextLine();
            if("PARE".equals(nomeHospede)){
                para = 1;
            }else{
                System.out.print("Qual a idade do hospede: ");
                idadeHospede = leia.nextInt();
                leia.nextLine();
                
                // Estrutura IFs (ok)
                if(idadeHospede > 4 && idadeHospede < 80){
                    valorHospedePagar+=100;
                }else if(idadeHospede >= 80){
                    valorHospedePagarMeia++;
                    valorHospedePagar+=50;
                    System.out.println(nomeHospede+" paga meia");
                }else{
                    valorHospedeNaoPagar++;
                    System.out.println(nomeHospede+" possui gratuidade");
                }
            }
            System.out.println("------------------------------");
        }
        System.out.println("Total de hospedagens: R$"+valorHospedePagar+"; "+valorHospedeNaoPagar+" gratuidade(s); "+valorHospedePagarMeia+" meia(s)");
    }
}
