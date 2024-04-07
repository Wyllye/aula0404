package aula0404;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Exercicio2 {

	public static void main(String[] args) {
		
		contaTempo(4, 1, 2026);
		
	}

	
	public static void contaTempo(int dia, int mes, int ano) {
		
		Calendar hoje = Calendar.getInstance();
		
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
		int mesHoje = hoje.get(Calendar.MONTH);
		int anoHoje = hoje.get(Calendar.YEAR);
		
		mesHoje ++;
		
		LocalDate dataParametro = LocalDate.of(ano, mes, dia);
		LocalDate dataHoje = LocalDate.of(anoHoje, mesHoje, diaHoje);
		
		
		Period periodo = Period.between(dataHoje , dataParametro);
		
		int diaDiferenca = periodo.getDays();
		int mesDiferenca = periodo.getMonths();
		int anoDiferenca = periodo.getYears();
		
		System.out.print("Faltam " + anoDiferenca + " ano(s), " + mesDiferenca + " mes(es) e " + diaDiferenca + " dia(s) para essa data em 2026");
	}
}
