public class TestaFuncionario {
	public static void main(String[] args) {
				
		Gerente jessica = new Gerente();
		jessica.setSalario(2000.0);
		jessica.cobraEntrega();
		
		System.out.println(jessica.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(jessica);
		
		System.out.println(totalizador.getTotal());
	}
}
