public class VariablesTheme{
	public static void main(String[] args) {
		System.out.println("\n\nЗадача 1 Создание переменных и вывод их значений на консоль (это название задачи)");
		//отделять задачи друг от друга пустой строкой
		byte socket = 1;
		short core = 8;
		int logicProcessor = 16;
		boolean virtualization = true;
		float maxSpeed = 2.60f;
		double workHour = 3.19;
		long discrpiptor = 51046;
		char intel = 'R';
		//Сокетов
		System.out.println("Sockets: " + socket);
		//Ядра
		System.out.println("Cores: " + core);
		//Логических процессоров
		System.out.println("Logical processors: " + logicProcessor);
		//Виртулизация
		System.out.println("Virtualization: " + virtualization);
		//Максимальная скорость (частота)
		System.out.println("Maximum speed: " + maxSpeed);
		//Время работы
		System.out.println("Working hours: " + workHour);
		//Дескрипторы
		System.out.println("Discrpiptors: " + discrpiptor);
		//Зарегестрированный товарный знак (У Процессора Intel)
		System.out.println("Intel: " + intel);


		System.out.println("\n\nЗадача 2 расчет стоимости товара со скидкой");
		int pen = 100;
	    int book = 200;
	    int allPrice = pen + book;
	    double discount = 0.11;
	    double sumDiscount = allPrice * discount;
	    double discountPrice = allPrice - sumDiscount;
		System.out.println("\nDiscount amount " + sumDiscount);
		System.out.println("Discount amount " + discountPrice);


		System.out.println("\n\nЗадача 3 Вывод на консоль слова JAVA");
		System.out.println("\n   J    a  v     v  a");
		System.out.println("   J   a a  v   v  a a");
		System.out.println("J  J  aaaaa  V V  aaaaa");
		System.out.println(" JJ  a     a  V  a     a");


		System.out.println("\n\nЗадача 4 Отображение min и max значений числовых типов данных");
		byte maxByte = 127;
	    short maxShort = 32767;
	    int maxInt = 2147483647;
	    long maxLong = 9223372036854775807L;
	    //значение
		System.out.println("Byte = " + maxByte + "\nShort = " + maxShort + "\nInt = " + maxInt + "\nLong = " + maxLong + "\n");
		//значение после инкремента
		System.out.println("MaxByte = " + (maxByte + 1) + "\nMaxShort = " + (maxShort + 1) + 
					       "\nMaxInt = " + (maxInt + 1) + "\nMaxLong = " + (maxLong + 1) + "\n");
		//значение после декремента
		System.out.println("MinByte = " + (maxByte - 1) + "\nMinShort = " + (maxShort - 1) + 
						   "\nMinInt = " + (maxInt - 1) + "\nMinLong = " + (maxLong - 1) + "\n");


		System.out.println("\n\nЗадача 5 Перестановка значений переменных");
		int oneNumber = 2;
		int twoNumber = 5;
		//с помощью третьей переменной
		System.out.println("Using the third variable: \nThe first number = " + oneNumber + "\nThe second number = " + twoNumber);
		int freeNumber = oneNumber;
		oneNumber = twoNumber;
		twoNumber = freeNumber;
		System.out.println("New first number = " + oneNumber + "\nNew second number = " + twoNumber);
		//с помощью арифметических операций
		System.out.println("Using arithmetic operations: \nThe first number = " + oneNumber + "\nThe second number = " + twoNumber);
		oneNumber-=twoNumber;
		twoNumber+=oneNumber;
		oneNumber = twoNumber - oneNumber;
		System.out.println("New first number = " + oneNumber + "\nNew second number = " + twoNumber);
		//с помощью побитовой операции
		int binaryNumber = 7;
		System.out.println("Using a bitwise operation: \nThe first number = " + oneNumber + "\nThe second number = " + twoNumber);
		oneNumber = oneNumber ^ binaryNumber;
		twoNumber = twoNumber ^ binaryNumber;
		System.out.println("New first number = " + oneNumber + "\nNew second number = " + twoNumber);


		System.out.println("\n\nЗадача 6 Вывод символов и их кодов");
		char oneSymbol = 35;
	    char twoSymbol = 38;
	    char freeSymbol = 64;
	    char fourSymbol = 94;
	    char fiveSymbol = 95;
		System.out.println("\nSymbol 35 = " + oneSymbol + "\nSymbol 38 = " + twoSymbol + 
						   "\nSymbol 64 = " + freeSymbol + "\nSymbol 94 = " + fourSymbol + "\nSymbol 95 = " + fiveSymbol);


		System.out.println("\n\nЗадача 7 Отображение количества сотен, десятков и единиц числа");
		int number = 123;
        int units = number % 10;
        int dozens = number / 10 % 10;
        int hundreds = number / 100;
        System.out.println("\nHundreds = " + hundreds);
        System.out.println("Dozens = " + dozens);
        System.out.println("Units = " + units);


		System.out.println("\n\nЗадача 8 ывод на консоль ASCII-арт Дюка");
	    char symbol1 = 47;
	    char symbol2 = 92;
	    char symbol3 = 95;
	    char symbol4 = 40;
	    char symbol5 = 41;
	    char symbol6 = 32;	    
		System.out.println("\n" + symbol6 + symbol6 + symbol6 + symbol6 + symbol1 + 
							    symbol2 + symbol6 + symbol6 + symbol6 + symbol6);
		System.out.println("" + symbol6 + symbol6 + symbol6 + symbol1 + symbol6 + 
								symbol6 + symbol2 + symbol6 + symbol6 + symbol6 + symbol6);
		System.out.println("" + symbol6 + symbol6 + symbol1 + symbol3 + symbol4 + 
								symbol6 + symbol5 + symbol2 + symbol6 + symbol6 + symbol6 + symbol6);
		System.out.println("" + symbol6 + symbol1 + symbol6 + symbol6 + symbol6 + 
								symbol6 + symbol6 + symbol6 + symbol2 + symbol6 + symbol6 + symbol6 + symbol6);
		System.out.println("" + symbol1 + symbol3 + symbol3 + symbol3 + symbol3 + 
								symbol1 + symbol2 + symbol3 + symbol3 + symbol2 + symbol6 + symbol6 + symbol6 + symbol6);


		System.out.println("\n\nЗадача 9 Произведение и сумма цифр числа");
		number = 345;
        units = number % 10;
        dozens = number / 10 % 10;
        hundreds = number / 100;
        System.out.println("\nThe sum of the digits of the number 345 = " + (units * dozens * hundreds));
        System.out.println("The product of the digits of the number 345 = " + (units + dozens + hundreds));


		System.out.println("\n\nЗадача 10 Преобразование секунд");
		int fullTimeSec = 71973;
	    int seconds = fullTimeSec % 60;
        int minutes = fullTimeSec /60 % 60;
        int hour = fullTimeSec / 60 / 60 % 24;
        System.out.println("\nHour " + hour + " Minutes " + minutes + " Seconds " + seconds);

	}
}