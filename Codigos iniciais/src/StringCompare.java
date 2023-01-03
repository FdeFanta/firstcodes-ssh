
public class StringCompare {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "goodbye";
		String s3 = "Happy Birth day";
		String s4 = "happy Birth day";
		
		System.out.printf(
				"s1 = %s%ns2 = %s%ns4 = %s%n",s1 ,s2, s3, s4
				);
		if (s1.equals("hello"))  // igualdade com equals // mais apropriado para saber se dois objetos tem o mesmo conteudo mesmo não sendo o mesmo objeto.
			System.out.println("s1 é igual a \"hello\"");
		else
			System.out.println("s1 não é igual a \"hello\"");
		if (s1 == "hello")  // igualdade com == só compara se dois objetos são o mesmo
			System.out.println("s1 é igual a \"hello\"");
		else
			System.out.println("s1 não é igual a \"hello\"");
		if (s3.equalsIgnoreCase(s4))  //igualdade ignorando as diferenças entre maiusculas e minusculas
			System.out.printf("%s é igual a %s se ignorar a maiuscula", s3, s4);
		else
			System.out.println("s3 não é iguala s4");
		
		// testando o compare a:
		
		System.out.printf(
				"%ns1.compareTo(s2) é %d", s1.compareTo(s2));
		System.out.printf(
				"%ns2.compareTo(s1) é %d", s2.compareTo(s1));
		System.out.printf(
				"%ns1.compareTo(s1) é %x", s1.compareTo(s1));
		System.out.printf(
				"%ns3.compareto(s4) é %d", s3.compareTo(s4));
		System.out.printf(
				"%ns3.compateTo(s4) é %d%n%n", s4.compareTo(s3));
		
		//teste de regionMatchers para achar onde da match
		
		if (s3.regionMatches(0, s4, 0, 5))
			System.out.println(
					"Os primeiros 5 caracteres de s3 e s4 dão match");
		else
			System.out.println(
					"Os 5 primeiros caracteres de s3 e s4 não dão match");
		
		if(s3.regionMatches(true, 0, s4, 0, 5))
			System.out.println(
					"Os Primeiros 5 Caracteres de s3 e s4 dão match se voce ignorar a diferença entre maiuscula e minuscula");
		else
			System.out.println(
					"Os primeiros 5 Caracteres de s3 e S4 não dão match nem se voce ignora as maiusculas");
	}

}
