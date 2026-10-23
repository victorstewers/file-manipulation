package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); //tanto caminho do arquivo quanto de uma pasta. 


        //Puxar o local das pastas
        File[] folders = path.listFiles(File::isDirectory); //Esse '::isDirectory' se chama "References Method"
        //A funcao isDirectory diz que é para listar apenas diretorios
        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder);
        }


        //Puxar o local apenas dos arquivos!
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for(File file : files){
            System.out.println(file);
        }

        //Criar uma subpasta:
        boolean success = new File(strPath +"\\subdir2").mkdir();
        System.out.println("Directory created successfully: "+success);

        sc.close();
    }
}
