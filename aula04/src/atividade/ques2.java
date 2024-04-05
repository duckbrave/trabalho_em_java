package atividade;

import java.time.LocalDate;
import java.time.Period;



public class ques2 {

	public static void main(String[] args) {
		contatempo(27, 4, 2024); // meu aniversario hihi
    }

    public static void contatempo(int dia, int mes, int ano) {
    
        LocalDate dataatual = LocalDate.now();
        LocalDate datafutura = LocalDate.of(ano, mes, dia);
        Period periodo = Period.between(dataatual, datafutura);
        
        System.out.println("Falta " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    }
}
