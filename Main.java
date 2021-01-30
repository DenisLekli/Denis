package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<User> data;

    public static void main(String[] args) {

        User user[] = new User[6];
        user[0]=new User("Andi","pass");
        user[1]=new User("Denis","harryfultz");
        user[2]=new User("ana","krv");
        user[3]=new User("kamela","uuu");
        user[4]=new User("ardenta","uuui");
        user[5]=new User("arenta","euui");

        ArrayList<String> produkte = new ArrayList<String>();
        produkte.add("patate");
        produkte.add("mish");
        produkte.add("salce");
        produkte.add("sallate");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.next();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your pas: ");
        String pas = scanner2.next();

        for(int i=0;i<user.length;i++) {
            if (username.equals(user[i].getName()) && pas.equals(user[i].getPassword())) {
                System.out.println("correct");
                System.out.println("Mirserdhet n restorant");
                System.out.println("Shkruani numrin e veprimit qe doni te beni ");
                System.out.println("Shtypni numrin 1 per Menun");
                System.out.println("Shtypni 2 per t shtuar nj produkt");
                System.out.println("Shtypni 3 per t fshir nj produkt");
                Scanner scanner3 = new Scanner(System.in);
                String menuja = scanner3.next();
                if (menuja.equals("1")) {
                    System.out.println(produkte);
                }


                System.out.println("Ju lutem shkruani emrin e produktit qe deshironi te shtoni:");
                Scanner scanner5 = new Scanner(System.in);
                String pace = scanner5.next();

                if (pace.equals(pace)) {
                    produkte.add( pace);
                    System.out.println(produkte);
                }

                System.out.println("Shtypni produktin qe doni t hiqni:");
                Scanner scanner4 = new Scanner(System.in);
                String patatet = scanner4.next();
                if (patatet.equals(produkte)) {
                    produkte.remove(patatet);
                    System.out.println(produkte);
                    System.out.println("Produkti "+patatet+" u fshi me sukses");
                } else System.out.println("Produkti "+patatet+" nuk ekziston");





            }//else{
            // System.out.println("error");
            //i+=5;
            //}


        }


    }
}
