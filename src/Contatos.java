
public class Contatos {
	
	private  String Nome;
	private String Email;



	public  String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	@Override
	public String toString() {
		return "Contatos [ Nome= "+getNome() + " /Email= "  + getEmail() +"]";
	}
	

}
