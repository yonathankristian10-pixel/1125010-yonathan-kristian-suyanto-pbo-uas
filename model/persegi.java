package model;

public class persegi extends segiempat{
    private double (){
    }
    public persegi(String label,double sisi){
        super(label,sisi,sisi);
        this.sisi=sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi=sisi;
        super.setpanjang(sisi);
        super.setlebar(sisi);
    }
    @Override 
     public double hitungkeliling(){
        return 4 * sisi;
     }
     @Override 
     public String getvalueDetail(){
        return new String[][]{
            {"label",getlabel()},
            {"sisi",String.valueOf(sisi)},
            {"luas permukaan",String.valueOf(hitungluaspermukaan())},
            {"keliling",String.valueOf(hitunkeliling())}
        }
     }

    
}
