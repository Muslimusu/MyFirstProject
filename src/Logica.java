import java.io.*;
import java.io.IOException;

public class Logica {
    public static boolean isArab = false;
    public static boolean isRum = false;
    static int a;
    static int b;
    static int rumResult;
    public static String[] arabNum = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
    };
    public static String[] rumNum = {
            "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
    };

    public static String read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int checkNum(String g) throws Exception {

        for (int i = 0; i < arabNum.length; i++) {
            if (g.equals(arabNum[i])) {
                isArab = true;
                return i;


            } else if (g.equals(rumNum[i])) {
                isRum = true;
                return i;
            }
        }
        throw new Exception("Ведите числа от 1 до 10");
    }

    public static void check(boolean a, boolean b) throws Exception {
        if (a == b) {
            throw new Exception("Введите совместимые числа");
        }
    }

    public static void operationIsArab(String s) throws Exception {
        int result = switch (s) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> throw new Exception("Неверно введена операция");
        };
        System.out.println(result);
    }


    public static boolean isArab() {

        return isArab;
    }

    public static boolean isRum() {

        return isRum;
    }

    public static final String[][] RomanDischarge = {

            {"I", "X", "C"},
            {"II", "XX", "CC"},
            {"III", "XXX", "CCC"},
            {"IV", "XL", "CD"},
            {"V", "L", "D"},
            {"VI", "LX", "DC"},
            {"VII", "LXX", "DCC"},
            {"VIII", "LXXX", "DCCC"},
            {"IX", "XC", "CM"},
    };

    public static void operationIsRum(int a, String operation, int b)throws Exception {
        if(operation.equals("+")){
            rumResult = a + b;
        } else
        if(operation.equals("-")){
            if(a >= b) {
                rumResult = a - b;
            }   else throw new Exception("Римские числа не могут быть отрицательными");
        } else
        if(operation.equals("/")){
            if(a > b) {
                rumResult = a / b;
            }   else throw new Exception("Римские числа не могут быть отрицательными");
        } else
        if(operation.equals("*")){
            rumResult = a * b;
        }        else throw new Exception("неверно введена операция");
    }

    public static void convertArabToRoman(int s){
        String charSearch;
        int indexCalc;
        int indexCalc2;


        switch (s) {
            case 100 -> System.out.println(Logica.RomanDischarge[0][2]);
            case 10, 20, 30, 40, 50, 60, 70, 80, 90 -> {
                charSearch = Integer.toString(s);
                indexCalc = Integer.parseInt(String.valueOf(charSearch.charAt(0)));
                String result = Logica.RomanDischarge[indexCalc - 1][1];
                System.out.println(result);
            }
            case 9, 8, 7, 6, 5, 4, 3, 2, 1 -> {
                charSearch = Integer.toString(s);
                indexCalc = Integer.parseInt(String.valueOf(charSearch.charAt(0)));
                String result = Logica.RomanDischarge[indexCalc - 1][0];
                System.out.println(result);
            }
            case 0 -> System.out.println("Выводим Арабский 0, хотя в Римских цифрах его нет");
            default -> {
                charSearch = Integer.toString(s);
                indexCalc = Integer.parseInt(String.valueOf(charSearch.charAt(0)));
                indexCalc2 = Integer.parseInt(String.valueOf(charSearch.charAt(1)));
                String reZ = RomanDischarge[indexCalc - 1][1];
                String ulT = RomanDischarge[indexCalc2 - 1][0];
                String result = reZ + ulT;
                System.out.println(result);
            }


        }


    }
}