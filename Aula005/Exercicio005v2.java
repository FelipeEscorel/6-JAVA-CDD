package Aula005;

public class Exercicio005v2 {
    public static void main(String[] args) {
        String array[] = {"a", "vida", "é", "bela"};
        StringBuilder texto = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            texto.append(array[i]); // Adiciona cada palavra
            if (i < array.length - 1) {
                texto.append(" "); // Adiciona espaço entre as palavras, exceto após a última
            }
        }

        System.out.println(texto);
    }
}