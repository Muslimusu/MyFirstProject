public class ArabRimCalc {
    public static void main(String[] args) throws Exception {
        String oneNum = null;
        String operation = null;
        String twoNum = null;
        Logica Logica = new Logica();   // инициализация
        String data[] = Logica.read().split(" ");// считываем с консоли и записываем
        oneNum = data[0];       //первое число
        operation = data[1];    //операция
        twoNum = data[2];       //второе число
        Logica.a = Logica.checkNum(oneNum);    //инициализация первого числа
        Logica.b = Logica.checkNum(twoNum);    //инициализация второго числа
        Logica.check(Logica.isArab(), Logica.isRum());  //проверка на однотипность
        if (Logica.isArab){         //проверка того какое число было на входе
            Logica.operationIsArab(operation);  //проводим операцию
        }
        if (Logica.isRum) {
            Logica.operationIsRum(Logica.a, operation, Logica.b);   //проводим операцию
            Logica.convertArabToRoman(Logica.rumResult);    // конвертация в Римские
        }
    }


}



