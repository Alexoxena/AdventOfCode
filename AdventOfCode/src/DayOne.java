import java.io.*;
import java.util.*;
public class DayOne {

	public static void main(String[] args) {
		int size = 200;
		int[] input = inputToIntArray();
		
		/*for(int i = 0; i < size; i++) {
			System.out.println(input[i]);
		}*/
		
		
		
		int number = result3(input, size);
		System.out.println(number);
		
	}
	
	/*static int inputSize () {
		int i = 0;
		Scanner scan = null;
		try {
			scan = new Scanner (new File ("InputDayOne.txt"));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scan.hasNext()) {
			   i++;
			   }
		scan.close();
		System.out.println(i);
		return i;
	}*/
	
	static int[] inputToIntArray() {
		int size = 200;
		int[] scanArray= new int[size];
	
		Scanner scan = null;
		try {
			scan = new Scanner (new File ("InputDayOne.txt"));
		}
		catch(FileNotFoundException e) {
			System.out.println("oups");

			e.printStackTrace();
		}
		int j = 0;
		while (scan.hasNext()&&j <200) {
			scanArray[j]=Integer.parseInt(scan.nextLine());
			j++;
		}
		scan.close();
		Arrays.sort(scanArray);
		return scanArray;
		
	}
	
	static int result2(int[] input, int inputSize) {
		
		for (int i = 0; i < inputSize; i++ ) {
			
			for ( int j = 0; j < inputSize; j++) {
				int result = input[i] + input[j];
				
				if(result == 2020) {
					return input[i] * input[j];
				}
				else if(result > 2020) {
					j = i;
					i++;
				}
				
			}
		}

		
		return 0;
	}
	
	static int result3(int[] input, int inputSize) {
		for (int i = 0; i < inputSize; i++) {
			
			for (int j = 0; j < inputSize; j++) {
				
				for (int k = 0; k < inputSize; k++) {
					int result = input[i] + input[j] + input[k];
					//System.out.println(result);
					//System.out.println(input[i] + ", " + input[j] + "," + input[k]);
					if(result == 2020) {
						System.out.println(i+": "+input[i]);
						System.out.println(j+": "+input[j]);
						System.out.println(k+": "+input[k]);


						return input[i] * input[j] * input[k];
						
					}
					
				}
			}
		}
		return 0;
	}

}
