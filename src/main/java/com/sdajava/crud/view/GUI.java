package com.sdajava.crud.view;

public class GUI {
    public static void showMenu() {
        System.out.println("\nWitaj w bazie danych ksiegarnia!\n" +
                "1. Wyswietl wszystkie ksiazki\n" +
                "2. Uaktualnij pozycje\n" +
                "3. Dodaj nowa pozycje\n" +
                "4. Usuń pozycje\n" +
                "0. Wyjście z systemu"
        );
    }

    public static void showSubMenu1() {
        System.out.println("Podmenu 1:\n" +
                "1. Liczba pracowników z pensją nie mniejszą niż podana\n" +
                "2. Średnia płaca w podanym dziale\n" +
                "3. Najlepiej zarabiający: Pani i Pan\n" +
                "4. *Wszystkie działy + stosunek kobiety/mężczyźni + średnia pensja w dziale\n" +
                "5. Wyświetl stosunek średniaj płacy kobiet do płacy mężczyzn\n" +
                "6. Zwiększ płace pracowników o 10% + extra dodatki\n" +
                "7. *Zwiększ pensje wszystkich o podaną kwotę\n" +
                "8. *Sortowanie pracowników według nazwiska w pliku - rosnąco/malejąco\n" +
                "9. *Sortowanie pracowników według pensji w pliku - rosnąco/malejąco\n" +
                "0. Wyjście do menu głównego"
        );
    }

    public static void showSubMenu2() {
        System.out.println("Podmenu 2 - export:\n" +
                "1. Wyświetlenie osoby o najdłuższym nazwisku\n" +
                "2. Średnia wiek osób dzietnych\n" +
                "3. Kodowanie nazwisk osób o pensji niższej niż średnia pensja\n" +
                "4. *Utworzenie pliku 'pracownicy.html'\n" +
                "0. Wyjście do menu głównego"
        );
    }

    public static void showEditMenu() {
        System.out.println("Co edytować u pracownika:\n" +
                "1. Zmiana nazwiska (dla kobiet tylko)\n" +
                "2. Zmiana wieku\n" +
                "3. Zmiana płacy\n" +
                "4. Zmiana działu\n" +
                "0. Wyjście do menu głównego"
        );
    }

    public static String systemInfo() {
        return "\nTO JEST PROGRAM DO OBSŁUGI HR";
    }
}
