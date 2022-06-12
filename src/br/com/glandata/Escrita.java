package br.com.glandata;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Escrita {

	public static void main(String[] args) {
		// Exemplo 1
		Path path = Path.of("C:\\TesteJava\\texto.txt");

		String texto = "Novo conteúdo para preencher o arquivo.";

		try {
			Files.writeString(path, texto, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> listaUsuarios = Arrays.asList("Ailton", "Gian", "Camila", "Pedro", "Célia", "Kelly", "Alessandra",
				"Amanda");
		List<String> listaTelefone = Arrays.asList("123", "456", "789", "987", "654", "321", "712", "741");

		// Exemplo 2
		Path novoPath = Path.of("C:\\TesteJava\\usuarios.txt");

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Lista de Usuários e Números de Linhas");

		int i = 1;
		for (String usuario : listaUsuarios) {
			stringBuffer.append("\nLinha " + i + ": \t" + usuario);
			i++;
		}

		try {
			Files.writeString(novoPath, stringBuffer, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Exemplo 3 - Gerando um arquivo CSV
		Path outroPath = Path.of("C:\\TesteJava\\usuarios.csv");

		StringBuffer outroStringBuffer = new StringBuffer();
		outroStringBuffer.append("Usuário;Numero Doido\n");

		int j = 0;
		for (String usuario : listaUsuarios) {
			outroStringBuffer.append(usuario + ";" + listaTelefone.get(j) + "\n");
			j++;
		}

		try {
			Files.writeString(outroPath, outroStringBuffer, StandardCharsets.ISO_8859_1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
