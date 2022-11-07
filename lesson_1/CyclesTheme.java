public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if(startNum % 2 == 0) {
                sumEvenNum += startNum;
            } else {
                sumOddNum += startNum;
            }
            startNum++;
        } while(startNum < 22);
        System.out.printf("в промежутке [-10, 21] сумма:\n");
        System.out.printf("четных чисел = %d", sumEvenNum);
        System.out.printf("\nнечетныхчетных чисел = %d", sumOddNum);

        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num2;
        int minNum = num3;
        if (num1 > maxNum) {
            maxNum = num1;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        if (num1 < minNum) {
            minNum = num1;
        }
        if (num2 < minNum) {
            minNum = num2;
        }
        for (int i = maxNum - 1; i >= minNum + 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sumDigits += digit;
            System.out.print(digit);
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int startRange = 1;
        int endRange = 24;
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 5; j++) {
                count = startRange;
                if (count > endRange) {
                    count = 0;
                }
                System.out.printf("%5s", count);
                startRange += 2;
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3242592;
        int origNum = num;
        int numUnits = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            numUnits++;
        }
        System.out.print("число " + origNum + " содержит ");
        if (numUnits % 2 == 0) {
            System.out.println("четное количество единиц");

        } else {
            System.out.println("нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int row = 5;
        while (row >= 1) {
            int coll = 1;
            while (coll <= row) {
                System.out.print("#");
                coll++;
            }
            System.out.println();
            row--;
        }

        row = 5;
        int coll = 0;
        int buffer = coll;
        do {
            int figure = 0;
            if (coll >= 3) {
                buffer--;
            } else {
                buffer++;
            }
            do {
                System.out.print("$");
                figure++;
            } while (figure != buffer);
            System.out.println();
            coll++;
        } while (coll != row);

        System.out.println("\n7.Отображение ASCII-символов");
        for(int i = 1; i < 48; i += 2) {
            System.out.println(i);
        }
        for(char j = 98; j < 123; j += 2) {
            System.out.println(j);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int reverseNum = 0;
        int copyNum = num;
        while(num != 0){
            int digit = 0;
            digit = num % 10;
            reverseNum = reverseNum*10 + digit;
            num /= 10;
        }
        if(copyNum == reverseNum) {
            System.out.println("число " + copyNum + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 123114;
        int firstHalfNum = 0;
        int secondHalfNum = 0;
        for (int i = 0;i < 6 ;i++ ) {
            if(i >= 3) {
                secondHalfNum += num % 10;
            } else {
                firstHalfNum += num % 10;
            }
            num /= 10;
        }
        System.out.println("Сумма цифр 123 = " + firstHalfNum);
        System.out.println("Сумма цифр 114 = " + secondHalfNum);
        if(firstHalfNum == secondHalfNum) {
            System.out.println("Является счастливым");
        } else {
            System.out.println("Не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("  |");
            } else {
                System.out.printf("%5d",i);
            }
        }
        System.out.println("\n———————————————————————————————————————————");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d |",i);
            for(int j = 2; j <= 9; j++) {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }
}