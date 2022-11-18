package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Kereta.jumlahBan();
        Motor.jumlahBan();
        String selamat = "Halo Teman-Teman";
        System.out.println(selamat);

        char[] dicodingChars = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
        String dicodingString = new String(dicodingChars);

        Date today = new Date();
        System.out.println("Hari ini adalah hari: " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok adalah hari: " + tomorrow);

    }
}