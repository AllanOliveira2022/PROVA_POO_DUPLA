package prova;

public class MAIN {

	public static void main(String[] args) {
		
		cadrastrodaconta cadastro = new cadrastrodaconta(10);

	       conta conta1 = new conta(852, 500, "Alan");
	       conta conta2 = new conta(963, 400, "Jadienne");

	        cadastro.cadastrar(conta1);
	        cadastro.cadastrar(conta2);

	        System.out.println("Quantidade de contas cadastradas: " + cadastro.qtdCadastradas());
	        
	        int numeroProcurar = 852;
	        conta contaEncontrada = cadastro.procurar(numeroProcurar);
	        if (contaEncontrada != null) {
	        	
	            System.out.println("Conta encontrada: " + contaEncontrada.getTitular());
	            
	        } else {
	        	
	            System.out.println("Conta não encontrada.");
	        }

	        int numeroExcluir = 852;
	        
	        boolean sucessoExcluir = cadastro.excluir(numeroExcluir);
	        if (sucessoExcluir) {
	        	
	            System.out.println("Conta removida com sucesso.");
	            
	        } else {
	        	
	            System.out.println("Conta não encontrada para remoção.");
	            
	            
	        }
	        

	        System.out.println("Quantidade de contas cadastradas após exclusão: " + cadastro.qtdCadastradas());
	  

	}

}
