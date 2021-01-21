package task1_variables;

public class MainClass {
    //глобальные переменные(поля), которые видны из любой части класса
    //должны быть static, чтобы можно было использовать (если в том же классе, что и main)

    //primitive variables, should be static;


    byte globalByte;
    short globalShort;
    static char globalChar;
    static int globalInt = (int) (Math.random() * 500 - 250);
    long globalLong;
    static float globalFloat;
    double globalDouble;
    boolean globalBoolean;

    //reference variables, should be static;
    static String globalReferenceString;
    Byte globalReferenceByte;
    Short globalReferenceShort;
    Integer globalReferenceInt;
    Long globalReferenceLong;
    Character globalReferenceChar;
    Float globalReferenceFloat;
    Double globalReferenceDouble;
    Boolean globalReferenceBoolean;

    static String globalStringResult;

    //метод запуска программы main
    public static void main(String[] args) {

        //создаётся экземпляр класса Variables(который описан в файле Variables.java
        Variables var = new Variables();
        //локальные переменные, которые видны только внутри метода (внутри {})
        char localChar = 'C';
        globalChar = 'n';
        int localInt;
        long localLong;
        Long localReferenceLong;
        Character localReferenceChar;
        Float localReferenceFloat;

        double localResultWithGetters;
        int localResultWithGlobalVar;

        //т.к объект уже создан, можно вызывать его, дёргая прописанные в нём методы через "." в данном случае это .get и .set
        //инициализирую переменные класса Variables, чтобы потом можно было что-то с ними делать
        //Math.random заполняет поле случайным числом в указанных пределах, можно вписать просто число
        var.setaDouble(Math.random() * 200 - 100);
        var.setReferenceInt((int) (Math.random() * 200 - 100));
        var.setaShort((short) (Math.random() * 1000 - 500));
        var.setReferenceString(" for Concatenatio");
        var.setaBoolean(false);

        //складываю и передаю из разных частей программы переменные. по названиеям переменных можно понять что откуда берётся
        localResultWithGetters = var.getaDouble() + var.getReferenceInt() + var.getaShort();

        localResultWithGlobalVar = globalInt + var.getReferenceInt();

        globalStringResult = localChar + var.getReferenceString() + globalChar;

        //результат вычисления приводится к int с потерей точности (убирается дробная часть)
        System.out.println("get double a = " + var.getaDouble() + "\n" + "get Integer b = " + var.getReferenceInt() + "\n" +
                "get short c = " + var.getaShort() + "\n" + "(int) a+b+c = " + (int) localResultWithGetters);
        System.out.println("global int + getInteger = " + localResultWithGlobalVar);
        System.out.println(globalStringResult);
        System.out.println();

        showAllVariablesWithDefaultInit();

    }

    //метод, который выводит на экран значения всех типов переменных, если их не инициализировать
    public static void showAllVariablesWithDefaultInit() {

        Variables Variables = new Variables();
        System.out.println("Default init:" + "\n" + "Primitive types:" + "\t" + "Reference types:");
        System.out.println("boolean: " + Variables.getaBoolean() + "\t\t" + "Boolean: " + Variables.getReferenceBoolean() + "\n" +
                "byte: " + Variables.getaByte() + "\t\t\t\t" + "Byte: " + Variables.getReferenceByte() + "\n" +
                "char: " + Variables.getaChar() + "\t\t\t\t" + "Character: " + Variables.getReferenceChar() + "\n" +
                "double: " + Variables.getaDouble() + "\t\t\t" + "Double: " + Variables.getReferenceDouble() + "\n" +
                "float: " + Variables.getaFloat() + "\t\t\t" + "Float: " + Variables.getReferenceFloat() + "\n" +
                "long: " + Variables.getaLong() + "\t\t\t\t" + "Long: " + Variables.getReferenceLong() + "\n" +
                "int: " + Variables.getAnInt() + "\t\t\t\t" + "Integer: " + Variables.getReferenceInt() + "\n" +
                "short: " + Variables.getaShort() + "\t\t\t" + "Short: " + Variables.getReferenceShort() + "\n" + "\t\t\t\t\t" +
                "String: " + Variables.getReferenceString());
    }
}