
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24266);
		// conta.numero = 137;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente luiz = new Cliente();
		// conta.titular = luiz;
		luiz.setNome("Luiz Guilherme");
		
		conta.setTitular(luiz);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
