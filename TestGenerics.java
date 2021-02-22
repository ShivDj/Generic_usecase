package generic;

	
	public class TestGenerics{
		public static void main(String[] ars) {

			Integer[] integerArr = { 10, 20, 30, 40 };
			Double[] doubleArr = { 100.0, 200.0, 300.0, 400.0 };
			String[] strArr = { "shiv", "ankita", "singhraul", "pranil" };

			//System.err.println();
			
			findMax(integerArr);
			findMax(doubleArr);
			findmaxString(strArr);
		
			
			//	int index = 0; 
		//  int a=intergerArr.length(;)
		//	int elementLength = integerArr[0];
		//	for(int i=1; i< integerArr; i++) {
		//	    if(array[i].length() > elementLength) {
		//	        index = i; elementLength = integerArr[i];
		//	    }
		//	}
		//	return array[index];
		//
			}

		public static <E> void printArray(E[] element) {
			for (E i : element)
				System.out.print(i + " ");
			System.out.println();
		}

		public static <T extends Comparable<T>> void findmaxString(T[] elements) {
		    T max = elements[0];
		    for (T i : elements) {
		      if (Integer.valueOf(i.toString().length()).compareTo(Integer.valueOf(max.toString().length()))
		          > 0) {
		        max = i;
		      }
		    }
		    System.out.println("the maximum value in array is " + max);
		  }
	public static <T extends Comparable<T>> void findMax(T[] element) {
			T max = element[0];
			for (T i : element) {
				if (i.compareTo(max) > 0) {
					max = i;
				}
			}
			System.out.println("Maximum element is :" + max);
		}


	
}
