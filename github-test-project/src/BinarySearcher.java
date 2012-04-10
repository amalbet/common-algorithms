public class BinarySearcher {

	public static int search(int[] array, int val) {

		int low = 0;
		int high = array.length - 1;
		int mid;

		while (low <= high) {

			mid = (low + high) / 2;

			if (array[mid] < val)
				low++;
			else if (array[mid] > val)
				high--;
			else
				return mid;
		}

		return -1;
	}

}
