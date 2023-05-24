import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int i;
        int valorRetirado;
        int valorTotal=0;
        int numSaques=0;
        int [] notas=new int[7];
        int menuPrincipal=0;
        for(i=0;i<7;i++){
            notas[i]=100;
        }
        while(menuPrincipal!=9) {

            System.out.println("Menu Principal\n" + "1 – Carregar Notas\n" + "2 – Retirar Notas\n" + "3 – Estatística\n" + "9 – Fim\n");
            menuPrincipal=sc.nextInt();

            switch (menuPrincipal) {
                case 1:
                    Metodos.carregarNotas(notas);
                    break;
                case 2:
                    System.out.println("Valor da retirada: ");
                    valorRetirado = sc.nextInt();
                    valorTotal+=valorRetirado;
                    numSaques+=1;
                    Metodos.retirarNotas(notas, valorRetirado);
                    break;
                case 3:
                    Metodos.estatistica(notas,valorTotal,numSaques);
                    break;
                default:
                    System.out.println("Fim");
                    break;
            }
        }
        System.exit(0);
    }
}