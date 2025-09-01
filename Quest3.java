import java.util.Scanner;

public class Quest3{
    public static void main(String [] args){
        Scanner leitor3 = new Scanner (System.in);
        System.out.println("escreva uma temperatura");
        double tempcelc = leitor3.nextInt();
        double tempf = ((tempcelc * 9/5) + 32);
        System.out.println("A sua temperatura em fahrenheit é: " + tempf);
    }
}