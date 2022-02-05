package home_work_1;

import java.util.Scanner;

public class Names1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String dad = "Вася";
        String mom = "Анастасия";
        String attempt = s.nextLine();
        //System.out.println(attempt.equalsIgnoreCase(dad) || attempt.equalsIgnoreCase(mom));
        if (attempt.equalsIgnoreCase(dad) || attempt.equalsIgnoreCase(mom)){
            if (attempt.equalsIgnoreCase(dad)){
                System.out.println("Привет!, отец!");
            }else{
                System.out.println("Я тебя так долго ждал, Мама!");
            }
        }else {
            System.out.println("День добрый, а вы кто такой?");
        }
    }
}

