package AvFormativa1611;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Fisica p1 = new Fisica("David" , "708-808-808-65" , "280372754-8");
		
		System.out.println("---Pessoa---");
		System.out.println("Nome" + p1.getNome());
		System.out.println("Cpf" + p1.getCpf());
		System.out.println("Rg" + p1.getRg());

	}

}
