import java.io.*;

public class Principal {

	  public static void main(String[] args) {

		  Principal obj = new Principal();
	    obj.run();

	  }

	  public void run() {

	    String arquivoCSV = "C:\\\\Users\\\\guilherme santanna\\\\workspace\\\\ImportarARQ\\\\src\\\\Arquivo.csv\\";
	    BufferedReader br = null;
	    String linha = "";
	    String csvDivisor = ",";
	    try {

	        br = new BufferedReader(new FileReader(arquivoCSV));
	        while ((linha = br.readLine()) != null) {

	            String[] Contato = linha.split(csvDivisor);

	            System.out.println("contato [Nome= " + Contato[Contato.length-2] 
	                                 + " , E-mail= " + Contato[Contato.length-1] + "]");

	        }

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
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

	}

	/*    public static void main(String[] args) throws IOException {
	    	String arquivo="C:\\Users\\guilherme santanna\\workspace\\ImportarARQ\\src\\Arquivo.csv\\";
	    	InputStream is = new FileInputStream(arquivo);
	    	InputStreamReader isr =  new InputStreamReader(is);
	    	BufferedReader br = new BufferedReader(isr);
	    	String s = br.readLine();
	    	while( s!=null){
	    		System.out.print(s);
	    		s = br.readLine();
	    		
	    	}
	    }
}*/