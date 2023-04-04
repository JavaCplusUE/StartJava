public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        char sign = '/';
        int num1 = 5;
        int num2 = 7;
        double result = 0;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = (double) num1 / (double) num2;
        } else if (sign == '^') {
            if (num1 != 0 & num2 != 0) {
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }
        if (result % 1 != 0) {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            return;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + (int) result);

    }
}
