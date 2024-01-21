package min_max;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayStats {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=scanner.nextInt();
		
		int[] array =new int[size];
		
		System.out.println("Enter the element of the array:");
		for(int i=0; i<size;i++) {
			System.out.println("Element: "+(i+1)+" : ");
			array[i]=scanner.nextInt();
		}
		int max=array[0];
		int min=array[0];
		
		for(int i=0;i<size;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Count repeated number :");
		Map<Integer,Integer>countMap=new HashMap<>();
		for(int num:array) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		System.out.println("Results : ");
		System.out.println("Array :"+ Arrays.toString(array));
		System.out.println("Maximum :"+  max);
		System.out.println("Minimum :"+  min);
		
		System.out.println("Repeated number and their counts");
		for(Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+": "+entry.getValue()+" times");
			}
		}
	}
}
