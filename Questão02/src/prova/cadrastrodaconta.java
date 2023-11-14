package prova;

public class cadrastrodaconta {
	
	 conta[] contas;
	    private int qtdCadastradas;

	    
	    public cadrastrodaconta(int tamanhoMaximo) {
	        contas = new conta[tamanhoMaximo];
	        qtdCadastradas = 0;
	    }

	    public boolean cadastrar(conta novaConta) {
	        if (qtdCadastradas < contas.length) {
	            contas[qtdCadastradas] = novaConta;
	            qtdCadastradas++;
	            return true;
	        } else {
	            return false; 
	        }
	    }

	    
	    public conta procurar(int numeroConta) {
	        for (int i = 0; i < qtdCadastradas; i++) {
	            if (contas[i].getNumero() == numeroConta) {
	                return contas[i]; 
	            }
	        }
	        return null; 
	    }

	   
	    public boolean excluir(int numeroConta) {
	        for (int i = 0; i < qtdCadastradas; i++) {
	            if (contas[i].getNumero() == numeroConta) {
	                
	                for (int j = i; j < qtdCadastradas - 1; j++) {
	                    contas[j] = contas[j + 1];
	                }
	                contas[qtdCadastradas - 1] = null; 
	                qtdCadastradas--;
	                return true; 
	            }
	        }
	        return false;
	    }

	
	    public int qtdCadastradas() {
	        return qtdCadastradas;
	    }

}
