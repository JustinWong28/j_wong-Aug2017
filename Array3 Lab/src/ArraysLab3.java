
import java.util.Arrays;

//Justin Wong
//November 5th, 2017
//Array3 lab

public class ArraysLab3 {

		
		/*
		 * Write a method named sum that accepts two arrays of integers arr1 and arr2 
		 * and returns an array of integers, 
		 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
		 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
		 */
		
		public static int[] sum(int[] arr1, int[] arr2) {
			assert (arr1.length > 0);
			assert (arr2.length > 0);
			assert (arr1.length == arr2.length);
			
			int[] total = new int[arr1.length];
			for (int i= 0; arr1.length > 0;i++) {
				total[i]= arr1[i] + arr2[i];
			}
			return total;
		}
		
		/*
		 * Write a method named append that accepts an array of integers arr of length n 
		 * and an integer num, and returns an array of integers of length n+1 
		 * that consists of the elements of arr with num appended to the end. 
		 * You can assume array arr has at least one element.
		 */
		
		public static int[] append(int[] arr, int num) {
			assert (arr.length > 0);
			int arrAppend[] = new int[arr.length + 1];
			for( int i = 0; arr.length > 0; i++) {
				arrAppend[i]= arr[i];
			}
			arrAppend[arr.length-1]= num;
			return arrAppend;
		}
		
		/*
		 * Write a method named remove that accepts an array of integers arr and an integer idx 
		 * and returns an array of integers consisting of all of the elements of arr 
		 * except for the element at index idx (thus, the returned array has a length of arr.length � 1). 
		 * You can assume arr has at least two elements.
		 */
		
		public static int[] remove(int[] arr, int idx) {
			assert (arr.length >= 2);
			int[] arrRemove = new int[arr.length-1];
			for( int i = 0; i < arr.length; i++) {
				if(i != idx) {
					if(i < idx) {
						arrRemove[i]= arr[i];
					}else { 
						arrRemove[i-1]= arr[i];
						
					}
				}
			}
				return arrRemove;
		}
		
		/*
		 * Write a method sumEven that accepts an array of integers arr 
		 * and returns an integer containing the sum of the elements at the even indices of arr. 
		 * (That means elements at indices 0,2,4,6,8.) You can assume arr has at least one element.
		 */

		public static int sumEven(int[] arr) {
			assert(arr.length > 0);
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if(i %2 == 0) {
					sum += arr[i];
				}
			}
			return sum;
				
			}
		
		/*
		 * Write a method rotateRight that accepts an array of integers arr 
		 * and does not return a value. 
		 * The rotateRight method moves each element of arr one index to the right 
		 * (element 0 goes to element 1, element 1 goes to element 2, �, element n-1 goes to element 0). 
		 * You can assume arr has at least one element.
		 */
		
		public static void rotateRight(int[] arr) {
			assert (arr.length > 0);
			int lastIndex= arr[arr.length - 1];
			for (int i = arr.length - 1; i >0; i++) {
				arr[i] = arr[i - 1];
			}
		}
		
		/*
		  */
		
		public static void main(String[] args) {
			int[] a1= {5, 10, 15, 20, 25, 30, 35, 40};
			int[] a2= {7, 14, 21, 28, 35, 42, 49, 56};
			int[] sumArr = sum( a1, a2);
			System.out.println(Arrays.toString(sumArr));
			
			int appendNum = 200;
			int[] appendArr = append( a1, appendNum);
			System.out.println(Arrays.toString(appendArr));
			
			int removeIdx = 5;
			int[] removeArr = remove(a2, removeIdx);
			System.out.println(removeArr);
			
			int sumOfEvens = sumEven(appendArr);
			System.out.println(sumOfEvens);
			
			rotateRight(a1);
			System.out.println(Arrays.toString(a1));
		}
}


