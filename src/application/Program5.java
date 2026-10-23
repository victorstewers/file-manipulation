package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: + "+path.getName()); // Pegar apenas nome do arquivo
        System.out.println("getParent: "+path.getParent()); //Pegar apenas o caminho, descartando o nome
        System.out.println("getPath: "+path.getPath()); //Pegar o caminho completo

        sc.close();
    }
}
