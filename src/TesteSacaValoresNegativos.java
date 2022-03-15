
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		
		// saldo agora é um atributo privado, e um atributo privado
		// não pode ser nem modificado e nem lido, apenas pela propria classe
		// por ser privado, o statement abaixo não iria compilar se não instanciasse o
		// metodo pega saldo
		System.out.println(conta.pegaSaldo());
		
	}

}
