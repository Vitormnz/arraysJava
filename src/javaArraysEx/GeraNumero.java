package javaArraysEx;

import java.util.Scanner;

public class GeraNumero {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        //criação de vetor:
        int inteiros[] = new int[10];
        for(int i = 0; i< inteiros.length; i++){
            inteiros[i] = 1;
            System.out.println(inteiros[i]);
        }

        //criação de matriz:
        int matriz [][] = new int[10][10];
        for (int i =0; i< matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
                System.out.println(matriz[i][j]);
            }
        }

        String nomes[] = new String[10]; //armazena 10 objetos String
        for(int i=0; i< nomes.length; i++){
            System.out.println("Digite um nome aleatório ai: ");
            nomes[i] = teclado.nextLine();
            }
        for(int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
        teclado.close();



    }


}

