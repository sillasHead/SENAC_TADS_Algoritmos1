package Lista03_LacosRepeticao;

public class Questao05 {
	public static void main(String[] args) {
		System.out.println("Números pares entre 100 e 1:\n");
		for(int i = 100; i >= 1; i--)
			if(i%2 == 0)
				System.out.println(i);
	}
}
