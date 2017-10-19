
public class Contatos {
	
	private static String Nome;
	private String Email;

	
	public  String getNome() {
	
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getEmail() {
	
		return Email;
	}
	public void setEmail(String cont) {
		Email = cont;
	}

	@Override
	public String toString() {
		return "Contatos [ Nome= "+getNome() + " /Email= "  + getEmail() +"]";
	}
	

}
