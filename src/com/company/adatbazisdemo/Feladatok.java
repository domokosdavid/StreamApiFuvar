package com.company.adatbazisdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Feladatok {
    private HashMap<String, String> adatok;

    public Feladatok(){
        this.adatok = new HashMap<>();
        Beolvas();
        kiir();
    }
    public String fejlec;
    private void Beolvas() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("fuvar.csv"));
            fejlec = br.readLine();
            String sor = br.readLine();
            while (sor!=null){
                String [] st = sor.split("\t");
                sor = br.readLine();
            }
            br.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }
    private void kiir(){
        System.out.println(fejlec);
        for (Map.Entry<String, String> entry: adatok.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
            System.out.println();
        }
    }
}
