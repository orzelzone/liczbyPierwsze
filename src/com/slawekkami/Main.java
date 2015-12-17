package com.slawekkami;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //zadeklarowanie obiektu klawiatura typu Scanner pobirającej dene z System.in
        Scanner klawiatura = new Scanner(System.in);
        //wyświetlenie informacji dla użytkownika co ma zrobić
        System.out.println("Podaj liczbę całkowtą");
        // zadeklarowanie zmiennej liczbaN i przypisanie jej wartości int z obiektu klawiatura
        int liczbaN = klawiatura.nextInt();
        // zamkniecie obiektu klawiatura typu Scanner ! zawsze to trzeba zrobić po zakończeniu wczytywania
        klawiatura.close();
        boolean pierwsza = false;
        for (int i=2; i<liczbaN; i++){
           if (liczbaN%i ==0 ) pierwsza = true;
       }
        if (liczbaN!=1 && pierwsza==true)
            System.out.println("Liczba " + liczbaN + " nie jest liczbą pierwszą");
        else
            System.out.println("Liczba " + liczbaN + " jest liczbą pierwszą");
    }
}
