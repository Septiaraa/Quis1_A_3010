/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.quis1_a_3010;

/**
 *
 * @author admin
 */
public class Dokter_3010 extends Penduduk_3010 {
    int jmlhPasien_3010, jmlhObat_3010;
    double pendapatanDokter_3010;
    
    public double totalPendapatanDokter(){
        return (jmlhPasien_3010*50000)+(jmlhObat_3010*10000);
    }
    public void tampilDataDokter(){
        tampilDataPenduduk();
        System.out.println("Jumlah Pasien: "+jmlhPasien_3010);
        System.out.println("Jumlah Obat  : "+jmlhObat_3010);
    }
}
