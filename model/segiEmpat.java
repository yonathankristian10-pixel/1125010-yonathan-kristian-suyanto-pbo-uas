package model;

public class segiempat extends Object2d{
    private double panjang;
    private double lebar;

    public segiempat(){
        super();
    }
    public segiempat(String label,double panjang,double lebar){
        super(label);
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public double getPanjang(){
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
    @Override
    public double hitungluaspermukaan(){
        return panjang*lebar;
    }
    @Override
    public double hitunkeliling(){
        return 2 * (panjang + lebar);
    }
    @Override
    public String getvalueDetail(){
        return new String[][]{
            {"label",getlabel()},
            {"panjang",String.valueOf(panjang)},
            {"lebar",String.valueOf(lebar)},
            {"luas permukaan",String.valueOf(hitungluaspermukaan())},
            {"keliling",String.valueOf(hitunkeliling())}
        }
    }
}

