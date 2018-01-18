
public class InPlaceSorts {

	public static void main(String[] args) {
		
	}
	
	public static void insertionSort(int [] list1) {
		for (int i = 0; i < list1.length; i++) {
			

		}
				
	}
	
	public static void selectionSort(double [] list1) {
		for (int i = 0; i < list1.length; i++) {
			
		}
	}
	
	public static void bubbleSort(String [] list1) {
		//while ()
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1.length-i; j++) {
				if (list1[j].length > list1[j+1].length) {
					String y = list1[i];
					list1[i] = list1[i+1];
					list1[i+1] = y;
				}	
			}
		}
	}
}
