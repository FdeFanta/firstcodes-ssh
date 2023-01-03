











public class StringStartEnd {
	public static void main(String[] args) {
		String[] strings = {"started", "staring", "ended", "ending"};
		for (String string : strings) {
		if(string.startsWith("st"))
			System.out.printf("\"%s\" começam com \"st\"%n ", string);
		}
		
		System.out.println();
		
		
		for (String string : strings) {
			
			if(string.startsWith("art", 2))
				System.out.printf(
						"\"%s\" começam com \"art\" na posição 2%n", string);
				}
		System.out.println();
		
		for (String string : strings) {
			if (string.startsWith("st"))
				System.out.printf("\"%s\" começam com \"art\" na posição 2%n", string);
					
		}
		
		System.out.println();
		
		for(String string : strings) {
			if(string.endsWith("ed"))
			System.out.printf("\"%s\" terminam com \"ed\"%n",string);
			
		}
	}
}


