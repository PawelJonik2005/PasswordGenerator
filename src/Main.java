import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigger = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smaller = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String special = "<>,.?/}]{[+_-)(*^&%$#@!~=";
        System.out.println("Z ilu znaków ma się składać hasło?");
        int len= scanner.nextInt();
        System.out.println("Czy hasło ma zawierać duże litery? Tak/Nie");
        boolean useBigger = scanner.next().equalsIgnoreCase("Tak");
        System.out.println("Czy hasło ma zawierać liczby? Tak/Nie");
        boolean useNumbers = scanner.next().equalsIgnoreCase("Tak");
        System.out.println("Czy hasło ma zawierać znaki specjalne? Tak/Nie");
        boolean useSpecial = scanner.next().equalsIgnoreCase("Tak");
        String combination = smaller;
        if (useBigger) {
            combination+=bigger;
        }
        if (useNumbers) {
            combination+=number;
        }
        if (useSpecial) {
            combination+=special;
        }
        char[] password= new char[len];
        Random random = new Random();
        for(int i=0; i<len;i++){
            password[i]=combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("Wygenerowane hasło: " + new String(password));
    }
}