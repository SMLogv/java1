package ru.stqa.pft.sandbox;

public class Primes {

    public static boolean isPrime (int n){
        for (int i = 2; i < n; i+=1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

public static void main (String[] args) {
        boolean result = isPrime(77);
        System.out.println(result);
    }

}
