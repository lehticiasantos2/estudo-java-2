
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Oliveira";
		paulo.cpf = "222.222.222.22";
		paulo.profissao = "Analista de Teste";
		
		Conta contadoPaulo = new Conta();
		contadoPaulo.deposita(100);
		
		contadoPaulo.titular = paulo;
		System.out.println(contadoPaulo.titular.nome);
	}
	

}
