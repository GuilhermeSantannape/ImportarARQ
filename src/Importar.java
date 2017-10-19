import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Importar {
	
	
	public static File csv = new File("arquivo.csv");	
	
	
	  private static void run() {
		
	    BufferedReader br = null;
	    String linha = "";
	    String csvDivisor = ",";
	    try {
//area abaixo em teste
/*	        br = new BufferedReader(new FileReader(csv));
	        while ((linha = br.readLine()) != null) {
	        String[] cont = linha.split(csvDivisor);
	    	int tam=1000;
		 	Contatos contato[]=new Contatos[tam];
		 	for (int i =0;i<contato.length;i++) {
		 		contato[i]=new Contatos();
		 		contato[i].setNome("null");
		 		contato[i].setEmail("null");
		 		contato[i].setNumPart(0);
		 	}
		 	Scanner ler = new Scanner(csv);
            String linhas = new String();
            int conts=0;
            
            while(ler.hasNext()){
            	linhas = ler.nextLine();
                String[] separa = linhas.split(",");
                contato[conts].setNome(separa[0]);
                contato[conts].setEmail(separa[1]);
                contato[conts].setNumPart(conts+1);
               System.out.println(contato[conts].toString());
                conts++;
            	}
                       
	        }*/

	    
	    } catch (IOException e) {
	        e.printStackTrace();
	        
	        
	    } finally {
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
