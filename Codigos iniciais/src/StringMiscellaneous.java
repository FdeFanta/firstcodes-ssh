
public class StringMiscellaneous {
	public static void main(String[] args) {
		String s1 = "Hello There";
		char[] charArray = new char[5];
		
		System.out.printf("s1 contem : %s", s1);
		System.out.printf("%nO Cumprimento da de s1 é: %d", s1.length());
		System.out.printf("%nA String reversa é: ");
		
		for (int cont = s1.length() -1; cont >= 0; cont--)
			System.out.printf("%c ",  s1.charAt(cont));
		s1.getChars(0,  5, charArray, 0);
		System.out.printf("%nO Caractere do array é: ");
		
		for (char character : charArray)
			System.out.print(character);
		System.out.println();
	}

}
