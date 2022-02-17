public class Primes {
    //МЕТОД ВЫВОД В КОНСОЛЬ ВСЕХ ПРОСТЫХ ЧИСЕЛ
    public static void main(String[] args){
        for (int i=2; i<=100; i++){
            if(isPrime(i)) System.out.print (i+" ");
        }
    }
    //ПОИСК ПРОСТЫХ ЧИСЕЛ
    public static boolean isPrime(int n) {
        for (int m = 2; m < n; m++) {
            if (n % m == 0) return false;
        }
        return true;
    }
}
