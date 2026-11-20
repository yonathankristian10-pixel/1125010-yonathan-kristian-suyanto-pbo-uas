package model;

public class balok extends Object3d{
    private double panjang;
    private double lebar;
    private double tinggi;

    public balok(){
        super();
    }
    public balok(String label,double panjang,double lebar,double tinggi){
        super(label);
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    public double getpanjang(){
        return panjang;
    }
    public void setpanjang(double panjang){
        this.panjang=panjang;
    }
    public double getlebar(){
        return lebar;
    }
    public void setlebar(double lebar){
        this.lebar=lebar;
    }
    public double gettinggi(){
        return tinggi;
    }
    public void settinggi(double tinggi){
        this.tinggi=tinggi;
    }
    @Override 
    public double hitungluaspermukaan(){
        return 2 * (panjang * lebar  + panjang * tinggi + lebar * tinggi);

    }
    @Override
    public double hitungvolume(){
        return panjang * lebar * tinggi;
    }
    @Override 
    public string getvalueDetail(){
        return new String[][]{
            {"label",getlabel()},
            {"panjang",String.valueOf(panjang)},
            {"lebar",String.valueOf(lebar)},
            {"tinggi",String.valueOf(tinggi)},
            {"luas permukaan",String.valueOf(hitungluaspermukaan())},
            {"volume",String.valueOf(hitungvolume())}
        }
    }

    
}
