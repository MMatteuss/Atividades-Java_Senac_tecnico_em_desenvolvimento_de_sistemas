package atividade1;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int convidados;
        
        System.out.print("Digite o numero de convidados: ");
        convidados = leia.nextInt();
        
       if(convidados>0 && convidados<220){
           System.out.println("Use o auditorio Alfa.");
           if(convidados>150){
               System.out.println("Inclua mais "+ (convidados-150) +" cadeiras.");
           }
           
       }else if(convidados >220 && convidados <=350){
           System.out.println("Use o audiotorio Beta.");
           
       } else{
           System.out.println("Numero de convidados invalido.");
       }
    }
    
}
