/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a idade dele: ");
        int idade = s.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B.");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adulto.");
        } else {
            System.out.println("Idade fora das categorias.");
        }
    }
}