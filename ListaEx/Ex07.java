package exercicios;

public class Ex07 {
	public static void main(String [] args) {
		for(int i = 1; i <= 5; i++) {
			
			System.out.println(i);
			
			switch (i) {
			case 1: 
				System.out.println("Caso 1 ");
				break;
			case 2:
				System.out.println("Caso 2");
				break;
			case 3:
				System.out.println("Pediu pra parar, parou");
				break;
			default:
				break;
			}
			
			if(i == 3) {
				break;
			}	
		}
	}
}
