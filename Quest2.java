import java.util.Scanner;
public class Quest2{
    public static void main (String [] args){
    Scanner leitor2 = new Scanner(System.in);
        System.out.println("escreva um numero");
        int num1 = leitor2.nextInt();
        System.out.println("escreva um numero");
        int num2 = leitor2.nextInt();
        System.out.println("escreva um numero");
        int num3 = leitor2.nextInt();

        float media = (num1+num2+num3) / 3;

        System.out.println("a media dos numeros é " + media);
    }
}