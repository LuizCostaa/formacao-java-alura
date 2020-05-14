
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente luiz = new Gerente();
		
		luiz.setNome("Luiz Guilherme");
		luiz.setCpf("222.222.222-22");
		luiz.setSalario(2600);
		
		System.out.println(luiz.getNome());
		System.out.println(luiz.getBonificacao());
	}
	
}
