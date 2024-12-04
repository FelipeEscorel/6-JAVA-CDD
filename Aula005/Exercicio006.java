package cddAula005;

public class Exercicio006 {
    public static void main(String[] args) {
        String array[] = {"a", "vida", "é", "bela"};
        StringBuilder texto = new StringBuilder();

        for (int i = 3; i >= 0; i--) {
            texto.append(array[i]); // Adiciona cada palavra
            if (i < array.length - 0) {
                texto.append(" "); // Adiciona espaço entre as palavras, exceto após a última
            }
        }

        System.out.println(texto);
    }
}