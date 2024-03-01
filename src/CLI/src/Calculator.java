public class Calculator {
    public static void main(String[] args) {
        try {
            double firstNumber = Double.parseDouble(args[0]);
            double secondNumber = Double.parseDouble(args[2]);
            char operation = args[1].charAt(0); // Important, the * must be in double quotes "*"

            if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
                System.err.println("Operation not valid");
            }

            double result;
            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                default:
                    result = 0;
            }
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
        } catch (Exception err) {
            System.out.println(err);
            System.err.println("Not valid numbers");
        }
    }
}
