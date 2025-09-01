import java.util.Scanner;

public class Quest4{
    public static void main (String[]args){
        Scanner leitor4 = new Scanner (System.in);
        System.out.println("escreva o valor do testamento");
        double test = leitor4.nextInt();
        double pessoa1 = (test/100) * 30;
        double pessoa2 = (test/100) * 38;
        double pessoa3 = (test/100) * 32;
        System.out.println("o valor do testamento divido para 3 pessoas ficou:");
        System.out.println("pessoa 1: " + pessoa1);
        System.out.println("pessoa 2: " + pessoa2);
        System.out.println("pessoa 3: " + pessoa3);
    }
}