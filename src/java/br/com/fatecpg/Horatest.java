package br.com.fatecpg;

public class Horatest {
    public static void main(String[] args) {
        Horario h1= new Horario();
        Horario h2= new Horario(15,03,30);
        
        System.out.println("São "+h1.getHorario()+ " " + h1.ismanha() + " " + h1.istarde() + " " + h1.isnoite() + " " + h1.ismadrugada());
        System.out.println("São "+h2.getHorario()+ " " + h2.ismanha() + " " + h2.istarde() + " " + h2.isnoite() + " " + h2.ismadrugada());
    }
}
