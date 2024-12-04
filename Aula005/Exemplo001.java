package Aula005;

import java.util.StringTokenizer;

public class Exemplo001 {

	public static void main(String[] args) {
		String str = "Hello";
			String resultado = str.replace("l", "w"); // Substituição
			System.out.println(resultado);
			System.out.println();
		
		String str2 = "Oi"; 
			String resultado2 = str2 + " Mundo"; // Concatenação
			System.out.println(resultado2);
			System.out.println();
		
		String str3 = "Hello World";
			String resultado3 = str3.substring (3, 8); // Posição incial e final (Ler entre eles)
			System.out.println(resultado3);
			System.out.println();
		
		String str4 = "Hello";
			String resultado4 = str.toUpperCase(); // Mudar para maiúsculo
			System.out.println(resultado4);
			System.out.println();
		
		String str5 = "Hello";
			String resultado5 = str.toLowerCase(); // Mudar para minúsculo
			System.out.println(resultado5);
			System.out.println();
		
		String str6 = "    Hello";
			String resultado6 = str.trim(); // Tira os espaços no começo e no final
			System.out.println(resultado6);
			System.out.println();
		
		String str7 = "Hello";
			char resultado7 = str7.charAt(1); // Extrair um caractere
			System.out.println(resultado7);
			System.out.println();
			
		String s1 = "Hello"; 
		String s2 = "HELLO";
			boolean b1 = s1.equals("Hello"); // Verificar se é igual
			boolean b2 = s1.equals(s2);
			boolean b3 = s1.equalsIgnoreCase(s2); // Verificar se é igual (Ignorando letras maiúsculas e minúsculas
			boolean b4 = s1.equalsIgnoreCase("azul");
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3);
			System.out.println(b4);
			System.out.println();
		
		String s3 = "abc";
			int tam = s3.length(); // Medir tamanho de uma string
			System.out.println(tam);
			System.out.println();
		
		String str8 = "Hello World World2";
			int position = str.indexOf("l"); // Mostra a posição da primeira ocorrência de um caractere de uma string
			System.out.println(position);
			int position2 = str8.lastIndexOf("l");// Mostra a posição da última ocorrência de um caractere de uma string
			System.out.println(position2);
			System.out.println();
		
		String valor = "CDD4.0 - Java";
			System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false); // Verificar se é igual
			System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);
			System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true : false); // Verificar se é igual (Ignorando letras maiúsculas e minúsculas
			System.out.println();
			
		String valor2 = "CDD - Java";
			System.out.println(valor.endsWith("Java")); // Verifica se termina com o parâmetro indicado
			System.out.println(valor.startsWith("C"));// Verifica se começa com o parâmetro indicado
			System.out.println(valor.startsWith("DD", 1));
			System.out.println();
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo, mas não iremos desistir nunca");
			System.out.println(exemplo.countTokens()); //Conta os espaços em branco, vírgulas, - , :
			
	}

}
