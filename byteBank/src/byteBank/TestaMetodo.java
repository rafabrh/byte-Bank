package byteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRafa = new Conta();
		contaDoRafa.saldo = 100;
		contaDoRafa.deposita(50);
		System.out.println(contaDoRafa.saldo);
// "=" para atributos e "()" para métodos
		
		boolean conseguiuSacar = contaDoRafa.saca(20);
		System.out.println(contaDoRafa.saldo);
		System.out.println(conseguiuSacar);

	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	
	if(contaDaMarcela.transfere(3000, contaDoRafa)) {
		System.out.println("transferencia realizada com sucesso");
	} else {
		System.out.println("Saldo insuficiente");
	}
	System.out.println(contaDaMarcela.saldo);
	System.out.println(contaDoRafa.saldo);
	
	
	}
}
