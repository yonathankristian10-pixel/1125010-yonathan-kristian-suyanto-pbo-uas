package model;
import model.keyvalueTable;
public class GObject {
    public abstract class GObject implements keyvalueTable{
        private String table;

        protected GObject(){
        }
        protected GObject(String label){
            this.label = label;
        }
        public String getlabel(){
            return label;
        }
        public void setLabel(String label){
            this.label = label;
        }
        @Override 
        public abstract String getvalueDetail();
    }
}
