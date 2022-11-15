/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.quis1_a_3010;

/**
 *
 * @author admin
 */
public class Nelayan_3010 extends Penduduk_3010 {
    int jmlhBeratIkan_3010, jmlhSolar_3010;
    double pendapatanNelayan_3010;
    
    public double totalPendapatanNelayan(){
        return pendapatanNelayan_3010 = (jmlhBeratIkan_3010*8000) - (jmlhSolar_3010*10000);
    }
    public void tampilDataNelayan(){
        tampilDataPenduduk();
        System.out.println("Berat Ikan   : "+jmlhBeratIkan_3010);
        System.out.println("Jumlah Solar : "+jmlhSolar_3010);

    }
}
