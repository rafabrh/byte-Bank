
public class TestaBanco {

	public static void main(String[] args) {
		Cliente Rafa = new Cliente ();
		Rafa.nome = "Rafael Alvarenga Braghittoni";
		Rafa.cpf = "484.384.157.78";
		Rafa.profissao = "Analista Senior";
		
		Conta contaDoRafa = new Conta();
		contaDoRafa.deposita(100);
		
//	ASSOCIA O CLIENTE RAFA COM A CONTA contaDoRafa 		
		contaDoRafa.titular = Rafa;
		System.out.println(contaDoRafa.titular.nome);
		System.out.println(contaDoRafa.titular);
		System.out.println(Rafa);
		
	}
	
}
