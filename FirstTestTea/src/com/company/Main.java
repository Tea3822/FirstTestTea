package com.company; // po default se kreira

public class Main { // po default se kreira main klasa

    public static void main(String[] args) {   //po default se kreira main metod.
        System.out.println("Hello World");  // vo klasata sekogas so golema bukvi
        //sega tuka se povikuvaat i toa so povikuvanje na SAY
        //i potoa vo () samo stavame dupli navodnici i samo iskucuva name: i zadavame vrednost

        sayHallo("Sofija");
        sayGoodbye("Tea");

    }
    public static void sayHallo(String name){
        System.out.println("Hello" +name);
        /*  ovoj metod ke isptinta Hello + promenliva name
        koja ke bide zadadena vo momentot koga ke go povikame ovoj metod */

    }
    public static void sayGoodbye(String name){
        System.out.println("Goodbye" +name); //plusot se vika kontanacija

        /* say Hallo i say Goodbye se sivi i ni dava sugestija da gi izbriseme zasto nikade ne se iskoristeni
        * koga ke gi povikame vo main klasata, tie ke pozoltat*/
    }
}