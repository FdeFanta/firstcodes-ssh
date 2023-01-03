import java.security.SecureRandom;
public class ContaDados {
	public static void main(String[] args) {
		SecureRandom num = new SecureRandom();
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		int x5 = 0;
		int x6 = 0;
		
		for (int roll = 1; roll <=6000000; roll++) {
			int face = 1 + num.nextInt(6);
			switch (face) {
			case 1:
				++x1;
				break;
			case 2:
				++x2;
				break;
			case 3:
				++x3;
				break;
			case 4:
				++x4;
				break;
			case 5:
				++x5;
				break;
			case 6:
				++x6;
				break;
			}
			
		}
		System.out.println("Face\tFrequency");
		System.out.printf("d1\t%d%nd2\t%d%nd3\t%d%nd4\t%d%nd5\t%d%nd6\t%d%n", x1, x2, x3, x4, x5, x6);
		
	}

}
