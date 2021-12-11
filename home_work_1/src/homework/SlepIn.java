package homework;


public class SlepIn {
    public static void main(String[] args) {//Тру - спать, фолс - пахать
        if (SlepIn.sleepIn(true,true)) {
            System.out.println("Спать");
        }else{
            System.out.println("Работать");
        }
    }


    static boolean sleepIn(boolean weekday, boolean vacation){
        if (weekday == false && vacation == false) {//Обычный выходной
            return true;
        }else if (vacation == true){//Обычный рабочий день
            return true;
        }else{
            return false;// Отпуск, в случае, если это рабочий день, и в случае выходной день. Ты в отпуске всё равно - отдыхаешь
        }
    }
}