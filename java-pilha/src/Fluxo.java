
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("ini main");
		try { 
			metodo1();			
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao {
		System.out.println("ini metodo 1");		
		metodo2();
		
		System.out.println("Fim metodo 1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("ini metodo 2");
		throw new MinhaExcecao("Deu Muito Errado");
	}
	
}
