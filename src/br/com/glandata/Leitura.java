package br.com.glandata;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Leitura {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\TesteJava\\usuarios.txt");

		List<String> usuarios = Files.readAllLines(path, StandardCharsets.UTF_8);

		for (int i = 1; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i));
		}
		System.out.println("\n");
		for (String usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}
