import java.io.*;

import java.util.*;

public class Principal {

	    public static void main(String[] args) throws IOException {
	    	String arquivo="C:\\Users\\guilherme santanna\\workspace\\Hello\\src\\hello.csv\\";
	    	InputStream is = new FileInputStream(arquivo);
	    	InputStreamReader isr =  new InputStreamReader(is);
	    	BufferedReader br = new BufferedReader(isr);
	    	String s = br.readLine();
	    	while( s!=null){
	    		System.out.print(s);
	    		s = br.readLine();
	    		
	    	}
	    }
}