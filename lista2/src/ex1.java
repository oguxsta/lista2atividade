/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Louiz
 */
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Raio da esfera: ");
        double R = s.nextDouble();
        double V = (4.0/3) * Math.PI * Math.pow(R, 3);
        
        System.out.printf("O volume da esfera: %.2f%n", V);
    
    }
}