package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);
            System.out.println("Enter file path");
            String sourceFilePath = sc.nextLine();
            File sourceFile = new File(sourceFilePath);
            boolean sucessOutDirectory = new File(sourceFile.getParent()+"\\out").mkdir();
            if(sucessOutDirectory){
                File outFile = new File(sourceFile.getParent()+"\\out\\summary.csv");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
                    BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
                    
                    String line = br.readLine();
                    while(line!=null){
                        String[] lineContent = line.split(",");
                        double totalValue = Double.parseDouble(lineContent[1]) * Double.parseDouble(lineContent[2]);
                        bw.write(lineContent[0]+","+String.format("%.2f",totalValue));
                        bw.newLine();
                        line = br.readLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            sc.close();


        
    }
}
