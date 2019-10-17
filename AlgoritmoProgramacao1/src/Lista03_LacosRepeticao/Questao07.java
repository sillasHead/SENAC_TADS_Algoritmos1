package Lista03_LacosRepeticao;

public class Questao07 {
	public static void main(String[] args) {
		int i = 200;
		
		System.out.println("Todos os múltiplos de 7 menores que 200:\n");
		while(i <= 200){
			if(i%7 == 0)
				System.out.println(i);
			
			i--;
		}
	}
}
