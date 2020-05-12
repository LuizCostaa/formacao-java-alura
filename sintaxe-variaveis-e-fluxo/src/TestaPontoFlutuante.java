
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("Meu salário é " + salario);
				
		/*
		 * Nao compila pois nao é possível atribuir valores de ponto flutuante em variaveis do tipo int
		 * int valor = 12.5;
		 * int valor2 = 0.0;
		 */
		
		
		/*
		 * Nao compila pois nao e possivel atribuir o valor de uma variavel do tipo double em uma variavel do tipo int
		 * double teste = 125.50;
		 * int valor3 = teste;
		 */
		
		/*
		 * A saida da operacao sera 2 pois o Java trunca os numeros quebrados
		 * int divisao = 5 / 2;
		 * System.out.println(divisao);  
		 */
			
		/* Assim obtemos a saida esperada = 2.5 */
		double divisao = 5.0 / 2;
		System.out.println(divisao);
	}
}
