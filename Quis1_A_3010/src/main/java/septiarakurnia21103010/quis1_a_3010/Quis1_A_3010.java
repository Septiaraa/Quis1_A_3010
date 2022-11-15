/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package septiarakurnia21103010.quis1_a_3010;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
public class Quis1_A_3010 {

    public static void main(String[] args) {
        //Membuat 2 Objek
        Nelayan_3010 N = new Nelayan_3010();
        Nelayan_3010 NN = new Nelayan_3010();
        Dokter_3010 D = new Dokter_3010();
        Dokter_3010 DD = new Dokter_3010();
        //BufferedReader untuk membaca file dari input stream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("\tINPUT DATA NELAYAN");
            System.out.print("NIK          : ");
            N.NIK_3010 = br.readLine();
            System.out.print("Nama         : ");
            N.nama_3010 = br.readLine();
            System.out.print("Umur         : ");
            N.umur_3010 = Integer.parseInt(br.readLine());
            System.out.print("Alamat       : ");
            N.alamat_3010 = br.readLine();
            System.out.print("Berat Ikan   : ");
            N.jmlhBeratIkan_3010 = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Solar : ");
            N.jmlhSolar_3010 = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.print("NIK          : ");
            NN.NIK_3010 = br.readLine();
            System.out.print("Nama         : ");
            NN.nama_3010 = br.readLine();
            System.out.print("Umur         : ");
            NN.umur_3010 = Integer.parseInt(br.readLine());
            System.out.print("Alamat       : ");
            NN.alamat_3010 = br.readLine();
            System.out.print("Berat Ikan   : ");
            NN.jmlhBeratIkan_3010 = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Solar : ");
            NN.jmlhSolar_3010 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("\tINPUT DATA DOKTER");
            System.out.print("NIK          : ");
            D.NIK_3010 = br.readLine();
            System.out.print("Nama         : ");
            D.nama_3010 = br.readLine();
            System.out.print("Umur         : ");
            D.umur_3010 = Integer.parseInt(br.readLine());
            System.out.print("Alamat       : ");
            D.alamat_3010 = br.readLine();
            System.out.print("Jumlah Pasien: ");
            D.jmlhPasien_3010 = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Obat  : ");
            D.jmlhObat_3010= Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.print("NIK          : ");
            DD.NIK_3010 = br.readLine();
            System.out.print("Nama         : ");
            DD.nama_3010 = br.readLine();
            System.out.print("Umur         : ");
            DD.umur_3010 = Integer.parseInt(br.readLine());
            System.out.print("Alamat       : ");
            DD.alamat_3010 = br.readLine();
            System.out.print("Jumlah Pasien: ");
            DD.jmlhPasien_3010 = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Obat  : ");
            DD.jmlhObat_3010= Integer.parseInt(br.readLine());
            System.out.print("");
            
            
            System.out.println("\t== DATA NELAYAN ==");
            N.tampilDataNelayan();
            System.out.println("Pendapatan   : Rp "+N.totalPendapatanNelayan());
            System.out.println("");
            NN.tampilDataNelayan();
            System.out.println("Pendapatan   : Rp "+NN.totalPendapatanNelayan());
            System.out.println("");
            System.out.println("\t== DATA DOKTER ==");
            D.tampilDataDokter();
            System.out.println("Pendapatan   : Rp "+D.totalPendapatanDokter());
            System.out.println("");
            DD.tampilDataDokter();
            System.out.println("Pendapatan   : Rp "+DD.totalPendapatanDokter());
        }
        catch(Exception ex) //untuk menangani error runtime
        {
            System.out.println(ex);
        }
    }
}
