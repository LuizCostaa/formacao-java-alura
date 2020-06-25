
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("ini main");
		try { 
			metodo1();			
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
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
		System.out.println("ini metodo 2");
		for (int i = 1; i<= 5; i++) {	 
			System.out.println(i);
			// int a = i / 0;		
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo 2");
	}
	
}
