package exercicios;

public class Ex03 {
	
	public static void main(String [] args) {
		
		for (int i = 1 ; i <= 5; i++) {
			
			System.out.println( "cont externo " + i );
			
			for(int j = 1 ; j <= 5; j++) {
				
				System.out.println("cont interno " + j);
				if(j == 3) {
					break;
				}
				
			}
			
			
		}
		
	}
}
