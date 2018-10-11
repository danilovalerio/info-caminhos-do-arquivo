package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Informe o endereço de um arquivo:");
		//String strCaminho = sc.nextLine();
		
		//Caminho padrão para teste
		String strCaminhoPadrao = "c:\\arquivos\\in.txt";
		
		File caminho = new File(strCaminhoPadrao);
		
		System.out.println("getPath: "+ caminho.getPath());
		System.out.println("getParent: "+ caminho.getParent());
		System.out.println("getName: "+ caminho.getName());
		
		sc.close();

	}

}
