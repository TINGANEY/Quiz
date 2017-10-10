package br.com.fatecpg;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        dia= mes=1; ano=2000;
    }
    
    public Data (int d, int m, int a){
        dia=d;
        mes=m;
        ano=a;
    }
    
    public boolean isBissexto(){
        if(ano % 400==0)
            return true;
        else{
            if (ano % 100==0)
                return false;
            else if(ano % 4 == 0)
                return true;
            else
                return false;
        }
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
   
    public String getData(){
        String out  ="";
        if(dia<10)out+="0";
        out += dia+"/";
        if(mes<10) out+="0";
        out+= mes +"/";
        out+= ano;
        return out;
    }
}
