package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> obshiysan=new ArrayList<>();
        ArrayList<Integer> jupsan=new ArrayList<>();
        ArrayList<Integer> taksan=new ArrayList<>();

        Random random=new Random();
        for (int i = 0; i < 51; i++) {
            int a= random.nextInt(1,100);
            obshiysan.add(a);

            if (a%2==0){
                taksan.add(a);
            }else {
                jupsan.add(a);
            }
        }System.out.println("OBSHIY SAN : "+obshiysan);
        System.out.println("JUP SANDAR  : "+taksan);
        System.out.println("TAK SANDAR : "+jupsan);
        }

    }

