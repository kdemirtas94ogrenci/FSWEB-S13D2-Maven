package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi) {
        String sayiStr = Integer.toString(Math.abs(sayi));
        String tersStr = new StringBuilder(sayiStr).reverse().toString();
        return sayiStr.equals(tersStr);
    }

    public static boolean isPerfectNumber(int sayi) {
        if (sayi < 1) {
            return false;
        }

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            switch (digit) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;
                case '2':
                    result.append("Two ");
                    break;
                case '3':
                    result.append("Three ");
                    break;
                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
            }
        }

        return result.toString().trim();
    }
}


