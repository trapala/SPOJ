package latweA.Strona1.A49_JLITOSL_przekroczenieCzasu;

//Zamiana liczby na slowa z polska gramatyka
//Krzysztof Kranc
//www.algorytm.org

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static String translacja(long liczba) {
        String[] jednosci = { "", "jeden ", "dwa ", "trzy ", "cztery ",
                "pięć ", "sześć ", "siedem ", "osiem ", "dziewięć ", };

        String[] nastki = { "", "jedenaście ", "dwanaście ", "trzynaście ",
                "czternaście ", "piętnaście ", "szesnaście ", "siedemnaście ",
                "osiemnaście ", "dziewiętnaście ", };

        String[] dziesiatki = { "", "dziesięć ", "dwadzieścia ",
                "trzydzieści ", "czterdzieści ", "pięćdziesiąt ",
                "sześćdziesiąt ", "siedemdziesiąt ", "osiemdziesiąt ",
                "dziewięćdziesiąt ", };

        String[] setki = { "", "sto ", "dwieście ", "trzysta ", "czterysta ",
                "pięćset ", "sześćset ", "siedemset ", "osiemset ",
                "dziewięćset ", };

        String[][] grupy = { { "", "", "" },
                { "tysiąc ", "tysiące ", "tysięcy " },
                { "milion ", "miliony ", "milionów " },
                { "miliard ", "miliardy ", "miliardów " },
                { "bilion ", "biliony ", "bilionów " },
                { "biliard ", "biliardy ", "biliardów " },
                { "trylion ", "tryliony ", "trylionów " }, };

// INICJACJA ZMIENNYCH
        long j = 0/* jedności */, n = 0/* nastki */, d = 0/* dziesiątki */, s = 0/* setki */, g = 0/* grupy */, k = 0/* końcówwki */;
        String slownie = "";
        String znak = "";

// OPERACJA DOTYCZąCA ZNAKU

        if (liczba < 0) {
            znak = "minus ";
            liczba = -liczba; // bezwględna wartość, jeśli będziemy
// operować na liczbie z minusem tablica będzie
// przyjmowała wartości ujemne i zwróci nam błąd
        }
        if (liczba == 0) {
            znak = "zero";
        }

// PĘTLA GŁÓWNA
        while (liczba != 0) {
            s = liczba % 1000 / 100;
            d = liczba % 100 / 10;
            j = liczba % 10;

            if (d == 1 & j > 0) // if zajmujący się nastkami
            {
                n = j;
                d = 0;
                j = 0;
            } else {
                n = 0;
            }

// <---- KOŃCÓWKI

            if (j == 1 & s + d + n == 0) {
                k = 0;

                if (s + d == 0 && g > 0) // jeśli nie będzie dziesiątek ani setek, wtedy otrzymamy samą grupę
                { // przykładowo 1000 - wyświetli nam się "tysiąc", jeśli
// zakomentujemy tego if'a to otrzymamy "jeden tysiąc"
                    j = 0;
                    slownie = grupy[(int) g][(int) k] + slownie;
                }
            } else if (j == 2) {
                k = 1;
            } else if (j == 3) {
                k = 1;
            } else if (j == 4) {
                k = 1;
            } else {
                k = 2;
            }

// KONIEC KOŃCÓWEK -->

            if (s+d+n+j > 0) {
                slownie = setki[(int) s] + dziesiatki[(int) d] + nastki[(int) n]
                        + jednosci[(int) j] + grupy[(int) g][(int) k] + slownie;
            }

// POZBYWAMY SIĘ TYCH LICZBY KTÓRE JUŻ PRZEROBILIŚMY czyli
// przykładowo z 132132 zostaje nam 132 do obróbki
            liczba = liczba / 1000;
// ORAZ ZWIĘKSZAMY G KTÓRE ODPOWIEDZIALNE JEST ZA NUMER POLA W
// TABLICY WIELOWYMIAROWEJ
            g = g + 1;
        }
// KONIEC PĘTLI GŁÓWNEJ

// DODANIE ZNAKU I ZWRÓCENIE METODY
        slownie = znak + slownie;
        return slownie;

    }

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        boolean isNotNumber = true;

        do {
            try {
                System.out.println("Wprowadź liczbę!");
                long liczba = skaner.nextLong();
                System.out.println(Main2.translacja(liczba));
                isNotNumber = false;
            } catch (InputMismatchException ime) {
                System.err.println("Złe dane!");
                skaner.nextLine();
                System.out.println("Wprowadź dane powownie");
            }

        } while (isNotNumber);
        skaner.close();
    }
}