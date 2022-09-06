public class VariablesTheme{
    public static void main(String[] args) {
        System.out.println("Задача 1 Создание переменных и вывод их значений на консоль (это название задачи)");
        byte socket = 1;
        short core = 8;
        int cpu = 16;
        boolean virtualization = true;
        float maxSpeed = 2.60f;
        double workHour = 3.19;
        long discrpiptor = 51046;
        char intel = 'R';
        System.out.println("Сокетов: " + socket);
        System.out.println("Ядра: " + core);
        System.out.println("Логических процессоров: " + cpu);
        System.out.println("Виртуализация: " + virtualization);
        System.out.println("Максимальная скорость (частота): " + maxSpeed);
        System.out.println("Время работы: " + workHour);
        System.out.println("Дескрипторы: " + discrpiptor);
        System.out.println("Зарегистрированный товарный знак (У Процессора Intel): " + intel);

        System.out.println("\nЗадача 2 расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int allPrice = pricePen + priceBook;
        double discount = 0.11;
        double sumDiscount = allPrice * discount;
        double discountPrice = allPrice - sumDiscount;
        System.out.println("Сумма скидки " + sumDiscount);
        System.out.println("Цена со скидкой " + discountPrice);


        System.out.println("\nЗадача 3 Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");


        System.out.println("\nЗадача 4 Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("Byte = " + maxByte + "\nShort = " + maxShort + 
                "\nInt = " + maxInt + "\nLong = " + maxLong + "\n");
        maxByte++;
        maxShort++;
        maxInt++;
        maxLong++;
        System.out.println("MaxByte = " + maxByte + "\nMaxShort = " + maxShort + 
                "MaxInt = " + maxInt + "\nMaxLong = " + maxLong + "\n");
        maxByte--;
        maxShort--;
        maxInt--;
        maxLong--;
        System.out.println("MinByte = " + maxByte + "\nMinShort = " + maxShort + 
                "MinInt = " + maxInt + "\nMinLong = " + maxLong);


        System.out.println("\nЗадача 5 Перестановка значений переменных");
        int oneNumber = 2;
        int twoNumber = 5;
        System.out.println("Использование третьей переменной: \nThe first number = " + 
                oneNumber + "\nThe second number = " + twoNumber);
        int buffer = oneNumber;
        oneNumber = twoNumber;
        twoNumber = buffer;
        System.out.println("New first number = " + oneNumber + "\nNew second number = " + twoNumber);
        System.out.println("Использование арифметических операций: \nThe first number = " + 
                oneNumber + "\nThe second number = " + twoNumber);
        oneNumber -= twoNumber;
        twoNumber += oneNumber;
        oneNumber = twoNumber - oneNumber;
        System.out.println("New first number = " + oneNumber + "\nNew second number = " + twoNumber);
        System.out.println("Использование побитовой операции: \nThe first number = " + 
                oneNumber + "\nThe second number = " + twoNumber);
        buffer = oneNumber ^ twoNumber ^ oneNumber;
        twoNumber = twoNumber ^ oneNumber ^ twoNumber;
        oneNumber = buffer;
        System.out.println("New first number = " + oneNumber + "\nNew second number = " + twoNumber);


        System.out.println("\nЗадача 6 Вывод символов и их кодов");
        char symbol1 = 35;
        char symbol2 = 38;
        char symbol3 = 64;
        char symbol4 = 94;
        char symbol5 = 95;
        System.out.println("Symbol 35 = " + symbol1 + "\nSymbol 38 = " + symbol2 + 
                "\nSymbol 64 = " + symbol3 + "\nSymbol 94 = " + symbol4 + "\nSymbol 95 = " + symbol5);


        System.out.println("\nЗадача 7 Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int dozens = number / 10 % 10;
        int hundreds = number / 100;
        System.out.println("Hundreds = " + hundreds);
        System.out.println("Dozens = " + dozens);
        System.out.println("Ones = " + ones);


        System.out.println("\nЗадача 8 вывод на консоль ASCII-арт Дюка");
        char symbo47 = '/';
        char symbol92 = '\\';
        char symbol95 = '_';
        char symbol40 = '(';
        char symbol41 = ')';
        char symbol32 = ' ';
        System.out.println("" + symbol32 + symbol32 + symbol32 + symbol32 + symbo47 + 
                                symbol92 + symbol32 + symbol32 + symbol32 + symbol32);
        System.out.println("" + symbol32 + symbol32 + symbol32 + symbo47 + symbol32 + 
                                symbol32 + symbol92 + symbol32 + symbol32 + symbol32 + symbol32);
        System.out.println("" + symbol32 + symbol32 + symbo47 + symbol95 + symbol40 + 
                                symbol32 + symbol41 + symbol92 + symbol32 + symbol32 + symbol32 + symbol32);
        System.out.println("" + symbol32 + symbo47 + symbol32 + symbol32 + symbol32 + 
                                symbol32 + symbol32 + symbol32 + symbol92 + symbol32 + symbol32 + symbol32 + symbol32);
        System.out.println("" + symbo47 + symbol95 + symbol95 + symbol95 + symbol95 + 
                                symbol32 + symbol92 + symbol95 + symbol95 + symbol92 + symbol32 + symbol32 + symbol32 + symbol32);


        System.out.println("\nЗадача 9 Произведение и сумма цифр числа");
        number = 345;
        ones = number % 10;
        dozens = number / 10 % 10;
        hundreds = number / 100;
        System.out.println("Сумма цифр числа 345 = " + (ones * dozens * hundreds));
        System.out.println("Произведение цифр числа 345 = " + (ones + dozens + hundreds));


        System.out.println("\nЗадача 10 Преобразование секунд");
        int fullTimeSec = 71973;
        int seconds = fullTimeSec % 60;
        int minutes = fullTimeSec /60 % 60;
        int hour = fullTimeSec / 60 / 60 % 24;
        System.out.println(hour + ":" + minutes + ":" + seconds);

    }
}