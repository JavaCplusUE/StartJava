public class VariablesTheme {
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
        double discountSum = allPrice * discount;
        double discountPrice = allPrice - discountSum;
        System.out.println("Сумма скидки " + discountSum);
        System.out.println("Цена со скидкой " + discountPrice);

        System.out.println("\nЗадача 3 Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4 Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("byte\n" + (maxByte) + "\n" + (++maxByte) + "\n" + (--maxByte));
        short maxShort = 32767;
        System.out.println("short\n" + (maxShort) + "\n" + (++maxShort) + "\n" + (--maxShort));
        int maxInt = 2147483647;
        System.out.println("int\n" + (maxInt) + "\n" + (++maxInt) + "\n" + (--maxInt));
        long maxLong = 9223372036854775807L;
        System.out.println("long\n" + (maxLong) + "\n" + (++maxLong) + "\n" + (--maxLong));

        System.out.println("\nЗадача 5 Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        System.out.println("Использование третьей переменной: \nThe first number = " +
                number1 + "\nThe second number = " + number2);
        int buffer = number1;
        number1 = number2;
        number2 = buffer;
        System.out.println("New first number = " + number1 + "\nNew second number = " + number2);
        System.out.println("Использование арифметических операций: \nThe first number = " +
                number1 + "\nThe second number = " + number2);
        number1 -= number2;
        number2 += number1;
        number1 = number2 - number1;
        System.out.println("New first number = " + number1 + "\nNew second number = " + number2);
        System.out.println("Использование побитовой операции: \nThe first number = " +
                number1 + "\nThe second number = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("New first number = " + number1 + "\nNew second number = " + number2);

        System.out.println("\nЗадача 6 Вывод символов и их кодов");
        char grid = '#';
        char ampersand = '&';
        char dog = '@';
        char circumflex = '^';
        char underline = '_';
        System.out.println("Symbol 35 = " + grid + "\nSymbol 38 = " + ampersand +
                "\nSymbol 64 = " + dog + "\nSymbol 94 = " + circumflex + "\nSymbol 95 = " + underline);

        System.out.println("\nЗадача 7 Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        System.out.println("Hundreds = " + hundreds);
        System.out.println("tens = " + tens);
        System.out.println("Ones = " + ones);

        System.out.println("\nЗадача 8 вывод на консоль ASCII-арт Дюка");
        char blackslash = '/';
        char backslash = '\\';
        char leftOpenPParenthesis = '(';
        char rightClosePParenthesis = ')';
        System.out.println("    " + blackslash + backslash + "    ");
        System.out.println("   " + blackslash + "  " + backslash + "    ");
        System.out.println("  " + blackslash + underline + leftOpenPParenthesis +
                " " + rightClosePParenthesis + backslash + "    ");
        System.out.println(" " + blackslash + "   " + "   " + backslash + "    ");
        System.out.println("" + blackslash + underline + underline + underline + underline +
                blackslash + backslash + underline + underline + backslash + "    ");

        System.out.println("\nЗадача 9 Произведение и сумма цифр числа");
        number = 345;
        ones = number % 10;
        tens = number / 10 % 10;
        hundreds = number / 100;
        System.out.println("Сумма цифр числа 345 = " + (ones * tens * hundreds));
        System.out.println("Произведение цифр числа 345 = " + (ones + tens + hundreds));

        System.out.println("\nЗадача 10 Преобразование секунд");
        int fullTimeSec = 71973;
        int seconds = fullTimeSec % 60;
        int minutes = fullTimeSec /60 % 60;
        int hour = fullTimeSec / 60 / 60 % 24;
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}