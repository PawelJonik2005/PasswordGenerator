import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigger = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smaller = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String special = "<>,.?/}]{[+_-)(*^&%$#@!~=";
        String combination = bigger+smaller+special+number;
        System.out.println("Z ilu znaków ma się składać hasło?");
        //int len=8;
        int len= scanner.nextInt();
        char[] password= new char[len];
        //char[] password= new char[len];
        Random random = new Random();
        for(int i=0; i<len;i++){
            password[i]=combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("Wygenerowane hasło: " + new String(password));
    }
}