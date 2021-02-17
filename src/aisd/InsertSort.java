package aisd;

public class InsertSort {
	
	public int[] sort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int searchedItem = array[i];
			while(j > 0 && array[j] > searchedItem) {
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j + 1] = searchedItem;
		}
		
		return array;
	}
}
