package Lesson2;

public class Pow {
   public static void main(String[] args) {
    }

        public double myPow(double x, int n) {
            return exponentiation(x, n);
        }
        public double exponentiation (double base, int pow){
            if (pow == 0) return 1;
            if (pow == 1) return base;
            if (base == 0 || base == 1) return base;
            if (pow < 0){
                return 1 / base * exponentiation (1 / base, -(pow + 1));
            }
            double calculation = exponentiation (base, pow / 2);
            double mult = calculation * calculation;
            if (pow % 2 == 1){
                mult *= base;
            } return mult;
        }
}