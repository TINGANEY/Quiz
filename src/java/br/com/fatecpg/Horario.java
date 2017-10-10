package br.com.fatecpg;

public class Horario {
    private int seg;
    private int min;
    private int hor;

    public Horario(){
     seg= min= hor=1;
    }
    public Horario(int h, int m, int s){
     hor=h;
     min=m;
     seg=s;
    }
    
    public boolean ismanha(){
        if (hor>=6 && hor<12)
            return true;
        else 
            return false;
    }
     public boolean istarde(){
        if (hor>=12 && hor<18)
            return true;
        else
            return false;
     }
      public boolean isnoite(){
        if (hor>=18 && hor<24)
            return true;
        else
            return false;
      }
       public boolean ismadrugada(){
        if(hor>=0 && hor<6)
            return true;
        else
            return false;
    }
    
    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHor() {
        return hor;
    }

    public void setHor(int hor) {
        this.hor = hor;
    }
    
    public String getHorario(){
        String tem="";
        if(hor<10)
            tem+="0";
            tem += hor +":";
        if(min<10) 
            tem+="0";
            tem += min+":";
        if(seg<10)
            tem="0";
            tem+=seg;
        return tem;
        
    }
}
