package ADO01;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		int mediaMensal = gastosTrimestre/3;
		
		System.out.print("Valor da m�dia mensal: " + mediaMensal);
		
	}

}
