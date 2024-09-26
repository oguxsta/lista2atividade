/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a altura (em metros): ");
        double altura = s.nextDouble();
        
        System.out.print("Informe o sexo (M para masculino, F para feminino): ");
        char genero = s.next().charAt(0);

        double peso;
        if (genero == 'M' || genero == 'm') {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }

        System.out.print("Informe seu peso atual: ");
        double pesoAtual = s.nextDouble();

        System.out.printf("Seu peso ideal é: %.2f kg%n", peso);
        if (pesoAtual < peso) {
            System.out.println("Voce esta abaixo do peso ideal.");
        } else if (pesoAtual > peso) {
            System.out.println("Voce esta acima do peso ideal.");
        } else {
            System.out.println("Voce esta no peso ideal.");
        }
    }
}