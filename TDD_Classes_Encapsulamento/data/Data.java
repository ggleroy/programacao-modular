package data;
import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private LocalDate date;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        date = LocalDate.of(ano, mes, dia);
    }
    public Data() {
        date = LocalDate.now();
        setDiaMesAno();
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    public void setDiaMesAno() {
        this.dia = date.getDayOfMonth();
        this.mes = date.getMonthValue();
        this.ano = date.getYear();
    }
    public void adicionaDias(int dias) {
        date = date.plusDays(Long.valueOf(dias));
        setDiaMesAno();
    }
    public int diasNoMes() {
        return date.lengthOfMonth();
    }
    public String diasDaSemana() {
        return date.getDayOfWeek().toString();
    }
    public boolean ehBissexto() {
        return date.isLeapYear();
    }
    public void proximoDia() {
        date = date.plusDays(1);
        setDiaMesAno();
    }
    public String porExtenso() {
        return "\n" + this.dia + " de " + this.mes + " de " + this.ano + "\n";
    }
}