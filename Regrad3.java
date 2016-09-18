
package regrad3;

import java.util.Scanner;

public class Regrad3 {

    
    public static void main(String[] args) {
        // Variaveis
        Scanner entrada = new Scanner (System.in);
        System.out.println("Bem vindo ao Regra D3");
        float valorw; 
        float valorz; 
        float valory; 
        float respostax;
        
        System.out.println("Digite um valor de cada vez, ao final de cada valor, "
                + "pressione enter.");
       
        // texto de regras de como colocar os valores na ordem correta
        System.out.println(" ");
        System.out.println("Assumindo que a equação da regra de 3 é feita a partir do sistema abaixo:");
        System.out.println(" ");
        System.out.println("W ---------- X");
        System.out.println("      X");
        System.out.println("Y ---------- Z");
        System.out.println(" ");
        
        System.out.println("Assuma que W*Z = ao o que voce já tem e X*Y você tem somente parte.");
        System.out.println("A equação inicial é W*Z = X*Y");
        System.out.println(" ");
        System.out.println("Coloque os valores seguindo a seguinte ordem:");
        System.out.println(" ");

       //Variaveis e suas respectivas entradas e textos de regras.
        System.out.println("Coloque o valor de W e pressione enter.");
        
        valorw = entrada.nextFloat();
        
        System.out.println("Coloque o valor de Z e pressione enter.");
        
        valorz = entrada.nextFloat();
        System.out.println(" ");
        System.out.println("O ultimo calculo é composto pela equação: X = W*Z/Y.");
        System.out.println(" ");
        System.out.println("Coloque o valor de Y e pressione enter.");
        
        valory = entrada.nextFloat();
        respostax = valorw*valorz/valory;
        
        System.out.println("O seu resultado é: " + respostax);
        
        
        
        
        
                
    }
    
}
