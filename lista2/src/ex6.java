/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */




import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        double n1 = s.nextDouble();

        System.out.print("Segundo valor: ");
        double n2 = s.nextDouble();

        System.out.print("Informe o operador aritmético (+, -, *, /): ");
        char operador = s.next().charAt(0);

        double resultado;
        switch (operador) {
            case '+':
                resultado = n1 + n2;
                System.out.printf("%.2f + %.2f = %.2f%n", n1, n2, resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.printf("%.2f - %.2f = %.2f%n", n1, n2, resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.printf("%.2f * %.2f = %.2f%n", n1, n2, resultado);
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.printf("%.2f / %.2f = %.2f%n", n1, n2, resultado);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
        
        }
    }
}