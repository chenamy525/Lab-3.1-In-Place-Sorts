
public class InPlaceSorts {

	public static void main(String[] args) {
	//Testing arrays
		int[] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//Insertion Sort test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds.");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds.");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds.");
		System.out.println(Arrays.toString(test3));
	}
	
	public static void insertionSort(int [] list1) {
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] > list1[i+1])
				i++;
			//?
		}
				
	}
	
	public static void selectionSort(double [] list1) {
		for (int i = 0; i < list1.length; i++) {
			while (list1[i] > list1[i+1]) {
				i++;
			}
			if (list1[i] < list1[i+1]) {
				double z = list1[i];
				list1[i+1] = list1[i];
				list1[i] = z;
			}
		}
	}
	
	public static void bubbleSort(String [] list1) {
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1.length-i; j++) {
				if (list1[j].length() > list1[j+1].length()) { //?????
					String y = list1[i];
					list1[i] = list1[i+1];
					list1[i+1] = y;
				}	
			}
		}
	}
}
