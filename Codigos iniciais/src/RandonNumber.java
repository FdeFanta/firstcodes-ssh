import java.security.SecureRandom;

public class RandonNumber
{

	public static void main(String[] args)
	{
	
		SecureRandom randomNum = new SecureRandom();
		for (int cont = 1; cont <= 20; cont++) {
	
			int num = 1 + randomNum.nextInt(6);
	
			System.out.printf("%d ", num);
			if (cont % 5 == 0)
				System.out.println();
		}
	}
}