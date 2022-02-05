package home_work_1;

import java.util.Scanner;

public class Names2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String mom = new String("Анастасия");
        String dad = new String("Вася");
        String attempt = s.nextLine();
        if (attempt.equalsIgnoreCase(mom)){
            System.out.println("Я тебя так долго ждал, Мама!");
        }else if (attempt.equalsIgnoreCase(dad)){
            System.out.println("Привет, отец!");
        }else{
            System.out.println("День добрый, а вы кто такой?");
        }
    }
}
