package AvFormativa1611;

public class PrincipalUsuario {

	public static void main(String[] args) {
		Usuario n1 = new Usuario(1, "Gui" , 123456 , "Adm" , "Guilherme" );
		 
		System.out.println("---Usuario---");
		System.out.println("Id: " + n1.getId());
		System.out.println("Nome: " + n1.getNome());
		System.out.println("Password: " + n1.getPassword());
		System.out.println("Permissão: " + n1.getPermissao());
		System.out.println("Usuario: " + n1.getUsuario());
		
	}

}
