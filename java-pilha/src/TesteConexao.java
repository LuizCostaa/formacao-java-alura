
public class TesteConexao {

	public static void main(String[] args) {

		Conexao con = new Conexao();
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		} finally {
			con.fecha();
		}
		
	}

}
