
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1770);
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela da Silva Moura";
		System.out.println(contaDaMarcela.titular.nome);
		
		
		
	}

}
