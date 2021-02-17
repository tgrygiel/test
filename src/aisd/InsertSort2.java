package aisd;

public class InsertSort2 {
	
	public int[] sort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			int searchedItem = array[i];
			int j = i - 1;
			for(; j >= 0 && array[j] > searchedItem; j--) {
					array[j + 1] = array[j];
			}
			array[j + 1] = searchedItem;
		}
		
		return array;
	}
}
