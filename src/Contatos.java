
public class Contatos {
	
	private static String Nome;
	private String Email;
	private int numPart;
	
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
	public void setNumPart(int numPart) {
		this.numPart = numPart;
	}
	@Override
	public String toString() {
		return "Contatos [Nome= "+getNome() + "Email= "  + getEmail() +"]";
	}

}
