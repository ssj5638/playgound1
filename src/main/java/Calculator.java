import java.util.Scanner;

public class Calculator {
    int add(int i, int j) {
        return i + j;
    }

    int subtract(int i, int j) {
        return i - j;
    }

    int multiply(int i, int j) {
        return i * j;
    }

    int divide(int i, int j) {
        return i / j;
    }

    void inputString() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int result = stringCalculator(value);
    }

    int stringCalculator(String value) {
        String[] values = value.split(" ");
        int first = Integer.parseInt(values[0]);
        int second;

        for (int i = 1; i < values.length - 1; i += 2) {
            second = Integer.parseInt(values[i+1]);
            if (values[i].equals("+")) {
                first = add(first, second);
            }
            if (values[i].equals("-")) {
                first = subtract(first, second);
            }
            if (values[i].equals("*")) {
                first = multiply(first, second);
            }
            if (values[i].equals("/")) {
                first = divide(first, second);
            }
        }

        return first;
    }
}

