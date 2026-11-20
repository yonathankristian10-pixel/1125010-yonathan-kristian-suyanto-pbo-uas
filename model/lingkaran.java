package model;

public class lingkaran extends Object2d{
    private double jari2;

    public lingkaran(String label,double jari2){
        super(label);
        this.jari2=jari2;
    }

    public double getjari2(){
        return jari2;
    }
    public void setjari2(double jari2){
        this.jari2=jari2;
    }
    @Override 
    public double hitungluaspermukaan(){
        return math.PI * jari2 * jari2;
    }
    @Override 
    public double hitungkeliling(){
        return 2 * math.PI * jari2;
    }
    
    
}
