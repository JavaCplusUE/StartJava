public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startNum = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            startNum++;
            if(startNum % 2 == 0) {
                sumEvenNum += startNum;
            } else {
                sumOddNum += startNum;
            }
        } while(startNum != 21);
        System.out.printf("в промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d" , sumEvenNum , sumOddNum);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
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
        
       for (int i = maxNum; i >= minNum ; --i) {
        System.out.print(i + " ");
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
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
        for (int i = startRange; i <= 3; i++) {
            for (int j = 0; j < 5; j++) {
                count = startRange;
                if (count > endRange) {
                    count = 0;
                }
                System.out.printf("%5s", count);
                startRange+=2;
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591;
        int buffer = 0;
        int evenNum = 0;
        int notEvenNum = 0;
        while (num != 0) {
            buffer = num % 10;
            num = num / 10;
            if (buffer % 2 == 0) {
                evenNum++;
            } else {
                notEvenNum++;
            }
        }
        System.out.println("число " + num + "содержит " + evenNum + " Четное количество единиц");
        System.out.println("число " + num + "содержит " + notEvenNum + " Нечетное количество единиц");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        num = 5;
        while (num >= 1) {
            num2 = 1;
            while (num2 <= num) {
                System.out.print("#");
                num2++;
            }

            System.out.println("");
            num--;
        }

        num = 3;
        num2 = 3;
        int num4 = 1;
        do {
            num3 = num2;
            num--;
            do {
                System.out.print("#");
                num3--;
            } while (num3 > num);
            System.out.println("");

        } while (num >= num4);
        do {
            num3 = num4;
            do {
                System.out.print("#");
                num3++;
            } while (num3 < num2);
            System.out.println("");
            num2--;
        } while (num2 > num4);

        System.out.println("\n7.Отображение ASCII-символов");
        String headDec = "Dec";
        String headChar = "Char";
        System.out.printf("%5s %15s %n", headDec, headChar);
        char n = 0;
        for(int i = 1; i < 48; i += 2) {
            n = (char) i;
           System.out.printf("%5s %15s %n", i, n);
        }
        for(int i = 98; i < 123; i += 2) {
            n = (char) i;
           System.out.printf("%5s %15s %n", i, n);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int rev = 0;
        int i = 0;
        int originalNum = num;

        while(num != 0){
            rev = num % 10;
            i = i*10 + rev;
            num = num / 10;
        }

            if(originalNum == i) {
                System.out.println("число " + originalNum + " является палиндромом");
            }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 123114;
        int abc = 0;
        int def = 0;
        for (i = 0;i < 6 ;i++ ) {
            if(i >= 3) {
                def += num % 10;
                num = num / 10;                
            } else {
                abc += num % 10;
                num = num / 10;
            }
        } 
        System.out.println("Сумма цифр 123 = " + abc);
        System.out.println("Сумма цифр 114 = " + def);
        if(abc == def) {
            System.out.println("Является счастливым");
        } else {
            System.out.println("Не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 1;i <= 9;i++) {
                if (i == 1) {
                    System.out.printf("  |");
                } else {
                    System.out.printf("%5d",i);
                }
        }
        System.out.println("\n———————————————————————————————————————————"); 
        for (i = 2;i <= 9;i++) {
            System.out.printf("%d |",i);
            for(int j = 2; j <= 9; j++) {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
}
}