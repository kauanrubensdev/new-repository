import java.util.Scanner;

public class latao{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("quantos kg de latao ce que fazer?");
        double latao = ler.nextDouble();

        double cobre = (latao/10) * 7;
        double zinco = (latao/10) * 3;

        System.out.println("pro ce fazer isso de latao ce vai precisar de " + cobre + " kg de cobre e " + zinco + " kg de zinco");
    }
}