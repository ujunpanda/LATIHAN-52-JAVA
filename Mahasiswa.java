/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Mahasiswa extends Manusia {
    
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim (String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas (String kelas){
        this.kelas = kelas;
        
    }
    
    public void kelasApa(){
        System.out.println("NIM  : "+nim);
        System.out.println("saya mahasiswa");
        System.out.println("saya  "+nama+" umur "+umur+"tahun "+"sedang belajar di kelas "+kelas);
        
    }
}
