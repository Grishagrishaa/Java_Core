package homework;

import java.util.Scanner;

public class Names3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String mom = "Анастасия";
        String dad = "Вася";
        String attempt = s.nextLine();
        switch (attempt){
            case "Анастасия":
                System.out.println("Я тебя так долго ждал, Мама!");
                break;
            case "Вася":
                System.out.println("Привет, отец!");
                break;
            default:
                System.out.println("День добрый, а вы кто такой?");
        }
    }
}
