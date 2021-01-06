package struk6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;

public class Struk6{
    public static void Kegiatan1(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String kalimat1=null;
        String regex = null;
        String replaceFix = null;
        String replace;
        try{
            System.out.print("Masukkan Kalimat Pertama : ");
            kalimat1 = bf.readLine();
            System.out.print("Masukkan Regex : ");
            regex = bf.readLine();
        }catch (IOException e){
            System.out.println(e);
        }
        
        String regexreal = ".*"+regex+".*";
        if (Pattern.matches(regexreal,kalimat1)){
            System.out.print("Replace : ");
            try{
            replace = bf.readLine();
            replaceFix = kalimat1.replaceAll(regex,replace);
            }catch (IOException e){
                System.out.println(e);
            }
        }else{
            System.out.println("Regex tidak cocok!");
        }
        System.out.println("Output : "+replaceFix);

    }

    public static void Kegiatan2(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String kalimat1 = null;
        String kalimat2 = null;
        String kalimat3 = null;
        try{
            //definisi variabel
            System.out.print("Masukkan Kalimat Ke-1 : ");
            kalimat1 = bf.readLine();
            System.out.print("Masukkan Kalimat ke-2 : ");
            kalimat2 = bf.readLine();
            System.out.print("Masukkan Kalimat ke-3 : ");
            kalimat3 = bf.readLine();
        }catch (IOException e){
            System.out.println(e);
        }

        //definisi kata kunci
        String key = ".*[Hh]ati.*";
        //Mencocokan nilai
        boolean kondisi1 = Pattern.matches(key,kalimat1);
        boolean kondisi2 = Pattern.matches(key,kalimat2);
        boolean kondisi3 = Pattern.matches(key,kalimat3);

        System.out.println("Kondisi Pertama : "+kondisi1);
        System.out.println("Kondisi Kedua   : "+kondisi2);
        System.out.println("Kondisi Ketiga  : "+kondisi3);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Kegiatan1" +
                "\n2. Kegiatan2" +
                "\n: ");
        int input = scan.nextInt();
        switch (input){
            case 1 :
                Kegiatan1();
                break;
            case 2 :
                Kegiatan2();
                break;
            default:
                break;
        }
    }
}