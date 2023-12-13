
//Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ; se non lo è, lancia un'eccezione.

public class Main {
    public static void main(String[] args) {
        int numero = 3;
        int estremoInferiore = 2;
        int estremoSuperiore = 7;
        System.out.println(controllaRange(numero, estremoSuperiore, estremoInferiore));

    }


    public static boolean controllaRange(int num, int estremoSuperiore, int estremoInferiore) {
        if (num >= estremoInferiore && num <= estremoSuperiore) {
            return true;

        } else {
            throw new ArithmeticException();

        }

    }

}

