package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) {
        
       String path = "C:\\Projetos Java\\vendas.txt";
        double revenue = 0;
       try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

        String line = bf.readLine();
        
        while(line!=null){
            String[] vect = line.split(",");
            revenue+=Double.parseDouble(vect[1]);
            line = bf.readLine();
        }
        System.out.println("Total revenue: "+String.format("%.2f",revenue));

       } catch (IOException e) {
            System.out.print("Error: "+e.getMessage());
       }


    }
    static String readFirstLineFromFile(String path) throws IOException {
	    try (FileReader fr = new FileReader(path);BufferedReader br = new BufferedReader(fr)) {
	        return br.readLine();
	    }
	}	
}
