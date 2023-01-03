
public class TipoDeReturn {
	public static void main(String[] args) 
	{
	int x = 2, y = 3, w = 4, z = 5;
	int re1 = soma(x, y);
	int re2 = soma(w, z);
	System.out.println(re1);
	System.out.println(re2);
	
}

static int soma(int a, int b) {
	int result = a + b;
	return result;

	}
}