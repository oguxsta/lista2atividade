/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento: ");
        int anoN = s.nextInt();

        int idade = 2024 - anoN;

        if (idade >= 18) {
            System.out.println("Apto para ambos.");
        } else if (idade >= 16) {
            System.out.println("Pode votar, mas não pode tirar habilitação.");
        } else {
            System.out.println("Idade insuficiente para ambos.");
        }
    }
}