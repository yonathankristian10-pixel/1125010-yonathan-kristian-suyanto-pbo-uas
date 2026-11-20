package model;

public class kubus extends Object2d{
    private double sisi;

    public kubus(String label,double sisi){
        super(label);
        this.sisi=sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public void setsisi(double sisi){
        this.sisi=sisi;
    }
    @Override
    public double hitungluaspermukaan(){
        return 6 * sisi * sisi;
    }
    @Override
    public double hitungvolume(){
         return sisi * sisi * sisi;
    }
    @Override
    public String getvalueDetail(){
        return new String[][]{
            {"label",getlabel()},
            {"sisi",String.valueOf(sisi)},
            {"luas permukaan",String.valueOf(hitungluaspermukaan())},
            {"volume",String.valueOf(hitungvolume())}
        }
    }  
}
