
	
	public class Principal {
		Contatos cont=new Contatos();
		Importar arq = new Importar();
		public static void main(String[] args) {
			  Importar.arquivo();
			  for(int i=0;i<10 ;i++)
			 System.out.println(Importar.contato[i]);
		
		  }


		}