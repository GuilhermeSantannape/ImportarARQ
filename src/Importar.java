import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Importar {
	static int tam=10;
	static Contatos contato[]=new Contatos[tam];
	
	private static File csv = new File("arquivo.csv");	
	
	
	  private static void run() {
		
	    BufferedReader br = null;
	    String linha = "";
	     try {

	        br = new BufferedReader(new FileReader(csv));
	        while ((linha = br.readLine()) != null) {
	        Scanner ler = new Scanner(csv);
	        String linhas = new String();
for (int i =0;i<contato.length;i++) {	contato[i]=new Contatos();}

		
            int contador=0;
            while(ler.hasNext()){
            	linhas = ler.nextLine();
                String[] Divide = linhas.split(",");
                contato[contador].setNome(Divide[0]);
                contato[contador].setEmail(Divide[1]);
                contador++;}
                       
	        }
	    
	 } catch (IOException e) 
	     { e.printStackTrace();  } finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	  }

	public static void arquivo() {
		run();}




}