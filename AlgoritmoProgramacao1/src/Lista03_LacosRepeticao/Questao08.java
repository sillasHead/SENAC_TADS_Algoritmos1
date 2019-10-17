package Lista03_LacosRepeticao;

public class Questao08 {
	public static void main(String[] args) {
		int contador = 0, soma = 0;
		for(int i = 13; i < 73; i++){
			if(i%2 == 0){
				soma += i;
				contador++;
				
				System.out.println(i);
			}
		}
		System.out.print("\nA média aritmética desses números é igual a " + soma/contador);
	}
}
