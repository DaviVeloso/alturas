package Aplication;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        double[] altura = new double[n];
        int[] idade = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite os dados da " + (i+1) + "a pessoa");
            System.out.println("Nome : ");
            nome[i] = sc.next();
            System.out.println("Idade : ");
            idade[i] = sc.nextInt();
            System.out.println("Altura ");
            altura[i] = sc.nextDouble();
        }
        double soma = 0;
        for(int i = 0; i < n; i++){
            soma += altura[i];
        }
        double mediaAltura = soma / n;
        System.out.println();
        System.out.printf("Altura media: %.2f%n", mediaAltura);

        int cont = 0;
        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
            cont += 1;
            }
        }
        double percent = cont * 100.0 / n;
        System.out.printf("pessoas com menos de 16 anos : %.1f%%%n", percent);
        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
    sc.close();
    }
}
