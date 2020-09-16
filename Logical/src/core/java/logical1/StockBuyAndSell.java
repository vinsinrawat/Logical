package core.java.logical1;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] array = {10,20,40,80,90};
		
		for(int i = 0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
			
			if(array[i]-min>max) {
				max = array[i]-min;
			}
		}
		System.out.println("Max value: "+max);
	}
}
