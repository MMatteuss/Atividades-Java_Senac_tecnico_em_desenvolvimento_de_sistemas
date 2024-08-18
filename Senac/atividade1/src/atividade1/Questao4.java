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
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha=0;
        int numeroDeCadastros=0;
        String[] nomesHospedes = new String[16];
        String nomePesquisa;
        
        for(int i=0; i<=15;i++){
            nomesHospedes[i] = " ";
        }
        
        while(escolha != 3){
            System.out.println("Digite 1- cadastrar; 2- pesquisar; 3- sair");
            escolha = leia.nextInt();
            leia.nextLine();

            switch(escolha){
                // Caso 1 (cadastrar)
                case 1:
                    if(numeroDeCadastros<16){
                        System.out.print("Digite o nome do hospede para o indice "+numeroDeCadastros+": ");
                        nomesHospedes[numeroDeCadastros] = leia.nextLine();
                    } else{
                        System.out.println("Máximo de hospede atingido!");
                    }
                    numeroDeCadastros++;
                break;

                // Caso 2 (pesquisar)
                case 2:
                    if(numeroDeCadastros>0){
                        System.out.print("Digite o nome do hospede que foi cadastrado: ");
                        nomePesquisa = leia.nextLine();
                        for(int i=0; i<=15; i++){
                            if(nomesHospedes[i].equals(nomePesquisa)){
                                System.out.println("Hospede "+nomesHospedes[i]+" foi encontrado no indice "+(i+1));
                            }
                            //System.out.println(nomesHospedes[i]);
                        }
                    }else{
                        System.out.println("Nenhum hospede foi cadastrado, cadastre pelo menos 1 hospede!");
                    }
                break;

                // Caso 3 (sair)
                case 3:
                    System.out.println("Programa encerrado");
                break;

                // Caso seja numero indesejado
                default:
                    System.out.println("Ops! Ocorreu um erro, Digite 1- cadastrar; 2- pesquisar; 3- sair");
                    escolha = leia.nextInt();
                    leia.nextLine();
                break;
            }
            System.out.println("----------------------------------");
        }
    }
    
}
