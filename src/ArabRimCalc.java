public class ArabRimCalc {
    public static void main(String[] args) throws Exception {
        String oneNum = null;
        String operation = null;
        String twoNum = null;
        Logica Logica = new Logica();
        String data[] = Logica.read().split(" ");// убираем пробелы
        oneNum = data[0];
        operation = data[1];
        twoNum = data[2];
        Logica.a = Logica.checkNum(oneNum);//проверка
        Logica.b = Logica.checkNum(twoNum);
        Logica.check(Logica.isArab(), Logica.isRum());
        if (Logica.isArab){
            Logica.operationIsArab(operation);
        }
        if (Logica.isRum) {
            Logica.operationIsRum(Logica.a, operation, Logica.b);
            Logica.convertArabToRoman(Logica.rumResult);
        }
    }


}



