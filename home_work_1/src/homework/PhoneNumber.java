package homework;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] array = {3, 7, 5, 2, 9, 9, 8, 0, 2, 3, 5, 7};
        System.out.println(createPhoneNumber(array));
    }

    public static String createPhoneNumber(int[] digits){
            return "+" + digits[0] + digits[1] + digits[2] + " (" + digits[3] + digits[4] + ") " + digits[5] + digits[6] + digits[7] + "-" + digits[8] + digits[9] + "-" + digits[10] + digits[11];
        }
    }
