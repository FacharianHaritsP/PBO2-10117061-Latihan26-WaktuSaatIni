/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan waktu saat ini
 */
public class PBO210117061Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
         Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, d MMMM yyyy, "
                + "HH:mm:ss");
               
        String kalender = tanggal.format(calendar.getTime());
        
System.out.println("Hari ini adalah hari : "+kalender);
    }
    
}
