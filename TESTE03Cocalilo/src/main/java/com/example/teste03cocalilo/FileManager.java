package com.example.teste03cocalilo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    // Caminho fixo para o arquivo de dados
    private static final Path FILE_PATH = Paths.get(
            "C:\\Users\\Nico\\IdeaProjects\\TESTE03Cocalilo\\src\\main\\java\\com\\example\\teste03cocalilo\\shared_data.txt"
    );

    // Método para salvar o valor no arquivo
    public static void saveValue(int value) {
        try {
            Files.writeString(FILE_PATH, String.valueOf(value));
            System.out.println("Valor salvo com sucesso em: " + FILE_PATH.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erro ao salvar o valor: " + e.getMessage());
        }
    }

    // Método para carregar o valor do arquivo
    public static int loadValue() {
        try {
            if (Files.exists(FILE_PATH)) {
                String content = Files.readString(FILE_PATH);
                return Integer.parseInt(content);
            } else {
                throw new IOException("Arquivo não encontrado em: " + FILE_PATH.toAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar o valor: " + e.getMessage());
            return -1; // Retorna -1 se ocorrer erro
        }
    }
}
