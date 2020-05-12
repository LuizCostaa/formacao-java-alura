
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLuiz = new Conta();
		contaDoLuiz.saldo = 100;
		contaDoLuiz.deposita(50);
		System.out.println(contaDoLuiz.saldo);
		
		boolean conseguiuRetirar = contaDoLuiz.saca(20);
		System.out.println(contaDoLuiz.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		
		if(contaDaMaria.transfere(3000, contaDoLuiz)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDaMaria.saldo);
		System.out.println(contaDoLuiz.saldo);
		
		
		contaDoLuiz.titular = "Luiz Guilherme";
		System.out.println(contaDoLuiz.titular);
	}
}
