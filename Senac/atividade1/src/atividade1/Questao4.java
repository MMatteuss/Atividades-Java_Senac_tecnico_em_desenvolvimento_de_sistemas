package atividade1;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in, "UTF-8");
        int escolha=0;
        int numeroDeCadastros=0;
        String[] nomesHospedes = new String[16];
        String nomePesquisa;
        
        for(int i=0; i<15;i++){
            nomesHospedes[i] = " ";
        }
        
        while(escolha != 3){
            System.out.println("Digite 1- cadastrar; 2- pesquisar; 3- sair");
            escolha = leia.nextInt();
            leia.nextLine();

            switch(escolha){
                // Caso 1 (cadastrar)
                case 1:
                    if(numeroDeCadastros<15){
                        System.out.print("Digite o nome do hospede para o cadastrado: ");
                        nomesHospedes[numeroDeCadastros] = leia.nextLine();
                    } else{
                        System.out.println("Maximo de hospede atingido!");
                    }
                    numeroDeCadastros++;
                break;

                // Caso 2 (pesquisar)
                case 2:
                    if(numeroDeCadastros>0){
                        System.out.print("Digite o nome do hospede que foi cadastrado: ");
                        nomePesquisa = leia.nextLine();
                        for(int i=0; i<15; i++){
                            if(nomesHospedes[i].equals(nomePesquisa)){
                                System.out.println("Hospede "+nomesHospedes[i]+" foi encontrado no indice "+(i+1));
                            }
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
                    System.out.println("Ops! Ocorreu um erro!");
                    System.out.println("Digite 1- cadastrar; 2- pesquisar; 3- sair");
                    escolha = leia.nextInt();
                    leia.nextLine();
                break;
            }
            System.out.println("----------------------------------");
        }
    }
    
}
