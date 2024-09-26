/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;
import java.time.LocalDate;

public class ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um mes (1 a 12): ");
        int MI = s.nextInt();

        if (MI < 1 || MI > 12) {
            System.out.println("Valor invalido.");
        } else {
            int MA = LocalDate.now().getMonthValue();
            if (MI < MA) {
                System.out.println("Mes ja passou.");
            } else if (MI == MA) {
                System.out.println("Mes atual.");
            } else {
                System.out.println("Mes futuro.");
            }
        }
    }
}