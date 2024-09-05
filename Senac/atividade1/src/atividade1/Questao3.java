package atividade1;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in, "UTF-8");
        String nomeHospede;
        int idadeHospede;
        int valorHospedePagar = 0;
        int valorHospedePagarMeia=0;
        int valorHospedeNaoPagar =0;
        int valorDiaria =0;
        byte para =0;
        
        System.out.println("Informe o valor da diaria: ");
        valorDiaria = leia.nextInt();
        leia.nextLine();
        
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
                if(idadeHospede>4 && idadeHospede<80){
                    valorHospedePagar+=valorDiaria;
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
