package atividade1;
import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        String hotel[][] = new String[4][3];
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                hotel[i][j] = "descocupado";
            }
        }
        
        Scanner leia = new Scanner(System.in);
        String continuar = "S";
        int andar;
        int quarto;
        
        while(continuar.equals("S")){
            // Informar andar e quarto
             System.out.println("Informe o Andar e o Quarto: ");
             andar = leia.nextInt();
             quarto = leia.nextInt();
             leia.nextLine();
             System.out.println("--------------------------");
             
             andar--; quarto--;
                
             // Cadastrar
             if(hotel[andar][quarto].equals("desocupado")){
                 System.out.println("Quarto já Ocupado");
             }else{
                 System.out.println("Quarto "+(andar+1)+" do Andar: "+(quarto+1)+", Foi Ocupado");
                 hotel[andar][quarto] = "ocupado";
             }
             
             //Continuar?
             System.out.println("Deseja informar outra ocupacao? (S/N): ");
             continuar = leia.nextLine().toUpperCase();
             System.out.println("--------------------------");
        }
        
        
        
        //Linha I || Coluna J
        System.out.println("----- Hotel, andares e quartos Ocupados e Descoupado --------");
        for(int i=0; i<4; i++){
            System.out.println((i+1)+" Andar:");
            for(int j=0; j<3; j++){
                System.out.println("- Quarto: "+(j+1)+" "+hotel[i][j]);
            }
            System.out.println("");
        }
        
    }
}
