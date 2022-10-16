public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int evenNum = 0;
        int oddNum = 0;
        do {
            num++;
            if(num % 2 == 0) {
                evenNum += num;
            } else {
                oddNum += num;
            }
        } while(num != 21);
        System.out.printf("в промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d" , evenNum , oddNum);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int minNum = 0;
        int maxNum = 0;
        if(num1 < num2 & num1 < num3) {
        minNum = num1;
        }
        if(num2 < num1 & num2 < num3) {
        minNum = num2;
        }
        if(num3 < num2 & num3 < num1) {
        minNum = num3;
        }
        if(num1 > num2 & num1 > num3) {
        maxNum = num1;
        }
        if(num2 > num1 & num2 > num3) {
        maxNum = num2;
        }
        if(num3 > num2 & num3 > num1) {
        maxNum = num3;
        }
       for (int i = maxNum; i >= minNum ; --i ) {
        System.out.println(i + " ");
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int buffer = 0;
        int sumNum = 0;
        while (num != 0) {
            buffer = num % 10;
            num = num / 10;
            sumNum += buffer;
            System.out.print(buffer);
        }
        System.out.println(sumNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int startNum = 1;
        int endNum = 24;
        buffer = 0;
        while (startNum <= endNum) {
            for (int j = 0; j < 5; j++) {
                buffer = startNum;
                if (buffer > endNum) {
                    buffer = 0;
                }
                System.out.printf(" " + buffer);
                startNum++;
            }
        System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591;
        buffer = 0;
        evenNum = 0;
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