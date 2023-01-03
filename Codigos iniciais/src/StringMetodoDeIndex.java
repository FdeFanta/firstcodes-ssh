
public class StringMetodoDeIndex {
	public static void main(String [] args) {
		String letters = "abcdefghijklmabcdefghijklm";
		
		//testando indexof para testar localização de caracteres em uma string
		
		System.out.printf(
				"'c' esta Localizada no index %d%n", letters.indexOf('c'));
		System.out.printf(
				"'a' esta Localizada no index %d%n", letters.indexOf('a', 1));
		System.out.printf(
				"'$' esta localizado no indice %d%n" , letters.indexOf('$'));
		
		
		System.out.println();
		
		//testando lastIndexOf para localizar caracteres em uma string
		
		System.out.printf(
				"o ultimo 'c' esta logalizado em %d%n", letters.lastIndexOf('c'));
		
		System.out.printf(
				"O ultimo 'a' esta localizado em %d%n", letters.lastIndexOf('a', 25));
		
		System.out.printf(
				"O ultimo '$' esta localizado em %d%n", letters.lastIndexOf('$'));
		
		System.out.println();
		
		//testando indexOf para localizar uma subStringem uma String
		//da pra procurar por grupos
		
		System.out.printf(
				"\"def\" esta localizado em %d%n", letters.indexOf("def"));
		System.out.printf(
				"\"def\" esta localizado em %d%n", letters.indexOf("def", 7));
		System.out.printf(
				"\"hello\" esta localizada no index %d%n", letters.indexOf("hello"));
		
		
		//testando lastIndexOf para localizar uma substring, mesma coisa que acima
		System.out.println();
		
		System.out.printf(
				"o ultimo def esta localizado em %d%n", letters.lastIndexOf("def"));
		System.out.printf(
				"O ultimo def esta localizado em %d%n", letters.lastIndexOf("def", 7));
				//começando do 25
		System.out.printf(
				"O ultimo \"hello\" esta em %d%n", letters.lastIndexOf("hello"));
		
	}
	

}




