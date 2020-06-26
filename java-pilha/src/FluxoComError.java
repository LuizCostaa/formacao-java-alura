
public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("ini main");
		try { 
			metodo1();			
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("ini metodo 1");		
		metodo2();
		System.out.println("Fim metodo 1");
	}
	
	private static void metodo2() {
		// Erro de StackOverflow
		System.out.println("Ini do metodo 2");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
	
}
