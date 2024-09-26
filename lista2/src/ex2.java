/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Matricula do funcionario: ");
        String mat = s.nextLine();

        System.out.print("Horas trabalhadas: ");
        int ht = s.nextInt();

        System.out.print("Informe o valor por hora: ");
        double vh = s.nextDouble();

        s.nextLine();
        System.out.print("Informe o mes referente (ex: junho/24): ");
        String mes = s.nextLine();

        double total;
        if (ht > 200) {
            int horasExtras = ht - 200;
            total = (200 * vh) + (horasExtras * vh * 1.5);
            System.out.println("Teve horas extras.");
        } else {
            total = vh * vh;
            System.out.println("Não teve horas extras.");
        }

        System.out.printf("Matrícula: %s%nHoras trabalhadas: %d%nMês: %s%nTotal: R$ %.2f%n",
                mat, vh, mes, total);
    }
}