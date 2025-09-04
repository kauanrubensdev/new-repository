import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.println("qual sua idade");
        int idade = leitor.nextInt();
        int suc = idade+1;
        int ant = idade-1;
        System.out.println("o sucessor da sua idade é: " + suc + " e o antecessor é: " + ant);
    }
}

