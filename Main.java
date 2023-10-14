public class Main {
    public static void main(String[] args) {

        int countPrime = 0;
        for (int i = 10; i <= 50; i++){
            if (isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                countPrime++;
                if (countPrime == 3){
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("Prime Number Counter Is : " + countPrime);
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber ==2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor ++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }



}
