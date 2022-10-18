public class IfElseStatementTheme{
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 31;
        boolean isMenGender = true;
        double height = 1.76;
        String name = "Igor";
        char firstLetterName = name.charAt(0);
        if(age > 20) {
            System.out.println("Больше 20 лет");
        } else {
            System.out.println("Не больше 20 лет");
        }
        if(!isMenGender) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }
        if(height < 1.80) {
            System.out.println("Рост меньше чем 1,80");
        } else {
            System.out.println("Рост не менее 1,80");
        }
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква не равна М");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 320;
        int num2 = 9;
        if(num1 < num2) {
            System.out.println("Первое число(" + num1 + ") меньше Второго числа(" + num2 + ")" );
        } else if(num1 > num2) {
            System.out.println("Первое число(" + num1 + ") больше Второго числа(" + num2 + ")" );
        } else {
            System.out.println("Первое число(" + num1 + ") равен Второму числу(" + num2 + ")" );
        }

        System.out.println("\n3. Работа с числом");
        num1 = 325;
        if (num1 == 0) {
            System.out.println("Число (" + num1 +") равен нулю");
        } else {
            if(num1 % 2 == 0) {
                System.out.println("Число (" + num1 +") чётное");
            } else {
                System.out.println("Число (" + num1 +") нечётное");
            }
            if(num1 < 0) {
                System.out.println("Число (" + num1 +") отрицательное");
            } else {
                System.out.println("Число (" + num1 +") положительное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 354;
        num2 = 944;
        System.out.println("Первое число = " + num1 + "\nВторое число = " + num2);
        if(num1 / 100 == num2 / 100) {
            System.out.println("Одинаковое число в первом разряде " + (num1 / 100));
        }
        if(num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("Одинаковое число в втором разряде " + (num1 / 10 % 10));
        }
        if(num1 % 10 == num2 % 10) {
            System.out.println("Одинаковое число в третьем разряде " + (num1 % 10));
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char definitCode = '\u0057';
        if(definitCode >= 97 & definitCode <= 122) {
             System.out.println("Символ " + definitCode + " это маленькая буква");
        } else if(definitCode >= 65 & definitCode <= 90) {
             System.out.println("Символ " + definitCode + " это большая буква");
        } else if(definitCode >= 48 & definitCode <= 57) {
             System.out.println("Символ " + definitCode + " это Число");
        } else {
            System.out.println("Символ " + definitCode + " не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double depositAmount = 300000;
        double interestBank = 0;
        
        if(depositAmount >= 100000 & depositAmount <= 300000) {
            interestBank = 0.07;
        } else if(depositAmount < 100000) {
            interestBank = 0.05;
        } else if(depositAmount > 300000) {
            interestBank = 0.10;
        }
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Начисленный % : " + (depositAmount * interestBank) + " руб");
        System.out.println("Итоговая сумма с % : " + (depositAmount + depositAmount * interestBank) + " руб");

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int estimationHistory = 0;
        int estimationProgramming = 0;
        if (percentHistory <= 60) {
            estimationHistory = 2;
        } else if (percentProgramming <= 60) {
             estimationProgramming = 2;
        }
        if (percentHistory > 60) {
            estimationHistory = 3;
        } else if (percentProgramming > 60) {
             estimationProgramming = 3;
        }
        if (percentHistory > 73) {
            estimationHistory = 4;
        } else if (percentProgramming > 73) {
             estimationProgramming = 4;
        }
        if (percentHistory > 91) {
            estimationHistory = 5;
        } else if (percentProgramming > 91) {
             estimationProgramming = 5;
        }
        System.out.println("По истории оценка: " + estimationHistory);
        System.out.println("По программированию оценка: " + estimationProgramming);
        System.out.println("Средний балл оценок по предметам: " + ((estimationHistory + estimationProgramming) / 2));
        System.out.println("Средний % по предметам: " + ((percentHistory + percentProgramming) / 2));

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int profit = 13000;
        int costPrice = 9000;
        int months = 12;
        int moneyYear = (profit - costPrice - rent) * months;
        if (moneyYear >= 0) {
            System.out.println("Прибыль за год: +" + moneyYear + " руб");
        } else if(moneyYear < 0) {
            System.out.println("Прибыль за год: " + moneyYear + " руб");
        } 

        System.out.println("\n9. Подсчет количества банкнот");
        int needMoney = 567;
        int bankBonknot1 = 99;
        int bankBonknot10 = 5;
        int bankBonknot100 = 99;
        int myBonknot100 = needMoney / 100;
        int myBonknot10 = needMoney % 100 / 10;
        int myBonknot1 = needMoney % 10;
        if(bankBonknot100 < myBonknot100) {
         myBonknot100 = bankBonknot100;
         myBonknot10 =(needMoney/100 - bankBonknot100) * 10 + myBonknot10;
        }
        if(bankBonknot10 < myBonknot10) {
        myBonknot10 = bankBonknot10;
        myBonknot1 = needMoney % 100 - (bankBonknot10 * 10);
        }
        if(bankBonknot1 < myBonknot1) {
            myBonknot1 -= bankBonknot1;
        }
        System.out.printf("В терминале номиналы блокнот: 1=%dшт 10=%dшт 100=%dшт", bankBonknot1, bankBonknot10, bankBonknot100);
        System.out.printf("\nТребуемое количество: 1=%dшт 10=%dшт 100=%dшт\n",myBonknot1, myBonknot10, myBonknot100);
        System.out.println("Исходная сумма: " + (myBonknot100*100 + myBonknot10*10 + myBonknot1) + " руб");

    }
}