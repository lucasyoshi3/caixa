import java.io.*;
public class Metodos {
    public static void carregarNotas(int [] notas){
        int i;
        for(i=0;i<7;i++){
            notas[i]=100;
        }
    }
    public static void retirarNotas(int [] notas, int valorRetirado){
        int valor=valorRetirado;
        if (valorRetirado%5==0) {
            while (valor != 0) {
                if (valor >= 200 & notas[6] != 0) {
                    System.out.println("200");
                    notas[6] -= 1;
                    valor = valor - 200;
                }
                if (valor >= 100 & valor <= 200 & notas[5] != 0) {
                    System.out.println("100");
                    notas[5] -= 1;
                    valor = valor - 100;
                }
                if (valor >= 50 & valor <= 100 & notas[4] != 0) {
                    System.out.println("50");
                    notas[4] -= 1;
                    valor -= 50;
                }
                if (valor >= 20 & valor <= 50 & notas[3] != 0) {
                    System.out.println("20");
                    notas[3] -= 1;
                    valor -= 20;
                }
                if (valor >= 10 & valor <= 20 & notas[2] != 0) {
                    System.out.println("10");
                    notas[2] -= 1;
                    valor -= 10;
                }
                if (valor >= 5 & valor <= 10 & notas[1] != 0) {
                    System.out.println("5");
                    notas[1] -= 1;
                    valor -= 5;
                }
                if (valor >= 2 & valor <= 5 & notas[0] != 0) {
                    System.out.print("2");
                    notas[0] -= 1;
                    valor -= 2;
                }
            }
        }else{
            if(notas[0]!=0) {
                while (valor % 5 != 0) {
                    System.out.println("2");
                    notas[0] -= 1;
                    valor = valor - 2;
                }
            }else{
                while (valor % 5 != 0) {
                    System.out.println("2");
                    valor = valor - 2;
                }
            }
            retirarNotas(notas, valor);
        }
    }
    public static void estatistica(int[] notas,int valorTotal,int numSaques) throws IOException {
        String nomeArquivo="Estatisticas.txt";
        BufferedWriter escreva=new BufferedWriter(new FileWriter(nomeArquivo));

        double mediaSaques=valorTotal/numSaques;
        System.out.println("Media de saques: "+mediaSaques);
        escreva.write("Media de saques:"+Double.toString(mediaSaques));
        escreva.newLine();

        System.out.println("Valor total dos saques: "+valorTotal);
        escreva.write("Valor total dos saques: "+ Integer.toString(valorTotal));
        escreva.newLine();

        System.out.println("Quantidade de saques: "+numSaques);
        escreva.write("Quanridade de saques: "+Integer.toString(numSaques));
        escreva.newLine();

        System.out.println("Sobra da nota de 200: "+notas[6]);
        escreva.write("Sobra da nota de 200: "+Integer.toString(notas[6]));
        escreva.newLine();

        System.out.println("Sobra da nota de 100: "+notas[5]);
        escreva.write("Sobra da nota de 100: "+Integer.toString(notas[5]));
        escreva.newLine();

        System.out.println("Sobra da nota de 50: "+notas[4]);
        escreva.write("Sobra da nota de 50: "+Integer.toString(notas[4]));
        escreva.newLine();

        System.out.println("Sobra da nota de 20: "+notas[3]);
        escreva.write("Sobra da nota de 20: "+Integer.toString(notas[3]));
        escreva.newLine();

        System.out.println("Sobra da nota de 10: "+notas[2]);
        escreva.write("Sobra da nota de 10: "+Integer.toString(notas[2]));
        escreva.newLine();

        System.out.println("Sobra da nota de 5: "+notas[1]);
        escreva.write("Sobra da nota de 5: "+Integer.toString(notas[1]));
        escreva.newLine();

        System.out.println("Sobra da nota de 2: "+notas[0]);
        escreva.write("Sobra da nota de 2: "+Integer.toString(notas[0]));
        escreva.newLine();
        
        escreva.close();
        System.exit(0);
    }
}