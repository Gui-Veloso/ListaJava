package exercicios;

public class Ex10 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, -1 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] < 0) {
				System.out.println("Acabou");
				break;
			}
			System.out.println(array[i]);

		}
	}
}
