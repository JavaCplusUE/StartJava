public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 31;
        boolean maleGender = true;
        double height = 1.76;
        String name = "Igor";
        char firstLetterName = name.charAt(0);
        if (age > 20) {
            System.out.println("Больше 20 лет");
        } else {
            System.out.println("Не больше 20 лет");
        }
        if (!maleGender) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }
        if (height < 1.80) {
            System.out.println("Рост меньше чем 1,80");
        } else {
            System.out.println("Рост не менее 1,80");
        }
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква не равна М");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 320;
        int number2 = 9;
        if (number1 < number2) {
            System.out.println("Первое число(" + number1 + ") меньше Второго числа(" + number2 + ")" );
        } else if (number1 > number2) {
            System.out.println("Первое число(" + number1 + ") больше Второго числа(" + number2 + ")" );
        } else {
            System.out.println("Первое число(" + number1 + ") равен Второму числу(" + number2 + ")" );
        }

        System.out.println("\n3. Работа с числом");
        number1 = 325;
        System.out.print("Число = ");
        if (number1 == 0) {
            System.out.println(number1);
        } else {
            if (number1 % 2 == 0) {
                System.out.print(number1 + " чётное");
            } else {
                System.out.print(number1 +" нечётное");
            }
            if(number1 < 0) {
                System.out.println(" и отрицательное");
            } else {
                System.out.println(" и положительное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        number1 = 123;
        number2 = 223;
        System.out.println("Первое число = " + number1 + "\nВторое число = " + number2);
        if (number1 % 10 == number2 % 10 || number1 / 10 % 10 == number2 / 10 % 10 ||
                number1 / 100 == number2 / 100) {
            System.out.println("Одинаковые числа: ");
            if (number1 % 10 == number2 % 10) {
                System.out.println((number1 % 10) + " в третьем разряде ");
            }
            if (number1 / 10 % 10 == number2 / 10 % 10) {
                System.out.println((number1 / 10 % 10) + " во втором разряде");
            }
            if (number1 / 100 == number2 / 100) {
                System.out.println((number1 / 100) + "в первом разряде");
            }
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char unknownCode = '\u0057';
        System.out.print("Символ " + unknownCode + " это ");
        if (unknownCode >= 'a' & unknownCode <= 'z') {
            System.out.println("маленькая буква");
        } else if (unknownCode >= 'A' & unknownCode <= 'Z') {
            System.out.println("большая буква");
        } else if (unknownCode >= '0' & unknownCode <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double depositAmount = 300000;
        double interestBank = 0.10;
        if (depositAmount < 100000) {
            interestBank = 0.05;
        } else if (depositAmount >= 100000 & depositAmount <= 300000) {
            interestBank = 0.07;
        }
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Начисленный % : " + (depositAmount * interestBank) + "руб");
        System.out.println("Итоговая сумма с % : " + (depositAmount + depositAmount * interestBank) + "руб");

        System.out.println("\n7.Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int gradeHistory = 2;
        int gradeProgramming = 2;
        if (percentHistory > 60) {
            gradeHistory = 3;
        } else if (percentHistory > 73) {
            gradeHistory = 4;
        } else if (percentHistory > 91) {
            gradeHistory = 5;
        }
        if (percentProgramming > 60) {
            gradeProgramming = 3;
        } else if (percentProgramming > 73) {
            gradeProgramming = 4;
        } else if (percentProgramming > 91) {
            gradeProgramming = 5;
        }
        System.out.println("По истории оценка: " + gradeHistory);
        System.out.println("По программированию оценка: " + gradeProgramming);
        System.out.println("Средний балл оценок по предметам: " + ((gradeHistory + gradeProgramming) / 2));
        System.out.println("Средний % по предметам: " + ((percentHistory + percentProgramming) / 2));

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int profit = 13000;
        int costPrice = 9000;
        int months = 12;
        int moneyYear = (profit - costPrice - rent) * months;
        if (moneyYear > 0) {
            System.out.println("Прибыль за год: +" + moneyYear + " руб");
        } else {
            System.out.println("Прибыль за год: " + moneyYear + " руб");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int needMoney = 567;
        int bankBanknot1 = 50;
        int bankBanknot10 = 5;
        int bankBanknot100 = 10;
        int myBanknot1 = needMoney % 10;
        int myBanknot10 = needMoney % 100 / 10;
        int myBanknot100 = needMoney / 100;
        System.out.printf("В терминале номиналы блокнот: 1 = %dшт 10 = %dшт 100 = %dшт\n",
                bankBanknot1, bankBanknot10, bankBanknot100);
        if (needMoney <= ((bankBanknot100 * 100) + (bankBanknot10 * 10) + bankBanknot1)) {
            if (bankBanknot100 < myBanknot100) {
                myBanknot10 += (needMoney / 100 - bankBanknot100) * 10;
                myBanknot100 = bankBanknot100;
            }
            if (bankBanknot10 < myBanknot10) {
                myBanknot1 += (myBanknot10 - bankBanknot10) * 10;
                myBanknot10 = bankBanknot10;
            }
            System.out.printf("\nТребуемое количество: 1 = %dшт 10 = %dшт 100 = %dшт\n",
                    myBanknot1, myBanknot10, myBanknot100);
            System.out.println("Выдаваемая сумма: " +
                    (myBanknot100 * 100 + myBanknot10 * 10 + myBanknot1) + " руб");
        } else {
            System.out.println("Не хватает банкнот в терминале");
        }
    }
}