
public class TesteIR {
	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario >= 1787.78 && salario <= 2679.29) {
			System.out.println("O IR é de 7.5%, voce pode reduzir R$134,08");
		} else if (salario >= 2679.30 && salario <= 3572.43) {
			System.out.println("O IR é de 15%, voce pode reduzir R$335,03");
		} else if (salario >= 3572.44 && salario <= 4463.81) {
			System.out.println("O IR é de 22.5%, voce pode reduzir R$602,96");
		} else if (salario > 4463.81) {
			System.out.println("O IR é de 27.5%, voce pode reduzir R$826,15");
		} else {
			System.out.println("Isento do IR");
		}
	}
}
