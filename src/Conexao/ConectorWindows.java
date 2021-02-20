package Conexao;

import java.io.IOException;
import java.util.Scanner;
public class ConectorWindows{

	public void start(String comando) {
		try {
			Process process = Runtime.getRuntime().exec(comando);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


