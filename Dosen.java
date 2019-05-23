/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip(){
        return nip;
    }     
    
    public void setNip(String nip) {
        this.nip=nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }     
    
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        System.out.println("NIP DOSEN : "+nip);
        System.out.println("saya dosen ");
        System.out.println("saya : "+nama+" umur  "+umur+" tahun sedang mengajar kuliah  "+mataKuliah);
    }
}


