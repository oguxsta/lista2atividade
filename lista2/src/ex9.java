import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

  
        System.out.print("Valor total da compra: ");
        double vc = s.nextDouble();

       
        System.out.print("Informe o codigo da condicao de pagamento (1 a 4): ");
        int cp = s.nextInt();

        double vf = vc;
        int parcelas = 1;  
        switch (cp) {
            case 1:
              
                vf = vc * 0.90;
                System.out.printf("Condicao de pagamento: a vista com 10%% de desconto.%n");
                break;
            case 2:
              
                vf = vc * 0.92;
                System.out.printf("Condicao de pagamento: a prazo, 1x com 8%% de desconto.%n");
                break;
            case 3:
              
                parcelas = 5;
                System.out.printf("Condicao de pagamento: a prazo, 5x sem desconto.%n");
                break;
            case 4:
               
                parcelas = 10;
                vf = vc * 1.05;
                System.out.printf("Condicao de pagamento: a prazo, 10x com acrescimo de 5%%.%n");
                break;
            default:
             
                System.out.println("Codigo de condicao de pagamento invalido.");
                return;
        }


        System.out.printf("Valor total a ser pago: R$ %.2f%n", vf);
        if (parcelas > 1) {
            double valorParcela = vf / parcelas;
            System.out.printf("Quantidade de parcelas: %d%n", parcelas);
            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
        }
    }
}