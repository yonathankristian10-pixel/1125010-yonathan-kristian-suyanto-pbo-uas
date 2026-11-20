package model;
  public abstract class Object2d extends GObject{
    protected Object2d(){
    }
    protected Object2d(String label){
        super(label);
    }
    public abstract double hitungLuasPermmukaan();
    public abstract double hitungVolume();
  }