package com.liceolapaz.des.llc;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        while (true){
            int random=generarRandom();
            System.out.println(random);
        }

    }

    private static int generarRandom() {
        return new Random().nextInt(3)+1;
        // return new Random().nextInt(max-min+1)+min;

    }
}
