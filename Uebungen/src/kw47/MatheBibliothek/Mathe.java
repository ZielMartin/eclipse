package kw47.MatheBibliothek;

public class Mathe {
	
	public static void printArray(final int[] array){
		
		for (int zahl: array){
			System.out.print(zahl + " ");
		}
	}
	
	public static double getAverage(final int[] array){
		int sum = 0;
		int quantity = 0;
		for (int zahl : array){
			sum = sum + zahl;
			quantity++;
		}
//		System.out.println(sum);
//		System.out.println(quantity);
		return (double)sum / quantity;
	}
	
	public static int getMedian(final int[] array){
		int[] array2 = bubbleSort(array);
		if(array2.length % 2 != 0){
			return array2[(array2.length - 1) / 2];
		}else{
			return (array2[(array2.length - 1) / 2] + array2[array2.length / 2]) / 2;
		}
	}
	
	public static int getUpperQuartile(final int[] array){
		int[] array2 = bubbleSort(array);
		return array2[(array2.length - 1) * 3 / 4];
	}
	
	public static int getLowerQuartile(final int[] array){
		int[] array2 = bubbleSort(array);
		return array2[(array2.length - 1) / 4];
	}
	
	public static int[] bubbleSort(int[] array){
		int n = array.length;
		boolean swapped, aus;
		int cache;
		do{
			aus = false;
			swapped = false;
			for (int i = 0; i<n-1; i++){
				if(array[i] > array[i+1]){
					cache = array[i];
					array[i] = array[i+1];
					array[i+1] = cache;
					swapped = true;
					System.out.print(array[i] + "," + array[i+1] + "; ");
				}else if(aus == false){
					System.out.println();
					printArray(array);
					System.out.println();
					aus = true;
				}
			}
			n--;
		} while(swapped == true);
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] array = {22, 24, 20, 17, 10, 23, 4, 9, 19, 10, 17, 21, 1, 16, 19, 5, 0, 20, 1, 6, 14, 18, 20, 2, 1};
		bubbleSort(array);
//		System.out.println(getUpperQuartile(array));
	}

}
