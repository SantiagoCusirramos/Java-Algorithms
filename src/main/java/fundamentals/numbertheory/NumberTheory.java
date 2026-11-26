package fundamentals.numbertheory;

class NumberTheory {

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        return num1 / num2;
    }

    public boolean identification_prime_numbers(int num) {

        if (num < 1) {
            return false;
        }
        if (num == 1 || num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(num);
        System.out.println(limit);

        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean verify_perfect_numbers(double num1) {
        if (num1 < 1) {
            return false;
        }
        return dividers_numbers(num1) == num1;
    }

    public int dividers_numbers(double num1) {
        if (num1 <= 1) {
            return 0;
        }
        int value = 1;
        int limit = (int) Math.sqrt(num1);

        for (int i = 2; i <= limit; i++) {
            if (num1 % i == 0) {
                value += i;

                if (i != num1 / i) {
                    value += num1 / i;
                }
            }
        }

        return value;
    }

    public boolean verify_friends_numbers(double num1, double num2) {

        if(num1 == num2){
            return false;
        }

        return (dividers_numbers(num1) == num2) && (dividers_numbers(num2) == num1);
    }

    public boolean isCoolNumber(int num) {
        // The program must comply with this formula -> n(n+1)/2 = num
        // n² + n - 2 * num = 0  --> (coefficient in A and B)a = 1 , b = 1 , c = 2 * num
        if (num <= 0) {
            return false;
        }
        double n = (-1 + Math.sqrt(1 + 8 * (double) num)) / 2; // n = [-b ± √(b² - 4ac)] / 2a
        return Math.abs(n - Math.round(n)) < 0.0000001;
    }

}
