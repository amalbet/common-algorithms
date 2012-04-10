public class Runner {

	public static void main(String[] args) {

		int[] array = new int[] { 3, 4, 6, 8, 9, 10, 12, 16, 19, 20, 26, 31 };

		int val = 31;

		int pos = BinarySearcher.search(array, val);
		System.out.println("position of value is: " + pos);
	}
}
