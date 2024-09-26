/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int A = s.nextInt();
        System.out.print("Informe o segundo valor: ");
        int B = s.nextInt();
        System.out.print("Informe o terceiro valor: ");
        int C = s.nextInt();

        if (A > B) {
            int igual = A;
            A = B;
            B = igual;
        }
        if (A > C) {
            int igual = A;
            A = C;
            C = igual;
        }
        if (B > C) {
            int igual = B;
            B = C;
            C = igual;
        }

        System.out.printf("Ordem crescente: %d, %d, %d%n", A, B, C);
    }
}