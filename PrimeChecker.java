public class PrimeChecker {

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false; // rẽ nhánh 1
        for (int i = 2; i <= Math.sqrt(number); i++) { // vòng lặp
            if (number % i == 0)
                return false; // rẽ nhánh 2
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 7, 10 };
        for (int number : numbers) {
            System.out.println(number + (isPrime(number) ? " la so nguyen to" : " khong la so nguyen to"));
        }
    }
}
