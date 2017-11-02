import java.util.Arrays;

public class LotsofCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		//System.out.println(num);
		//System.out.println(strMain);
		//System.out.println(Arrays.toString(arrMain));

	}
	public static void changeMe (int x, String str, int[] arr) {
		x=3;
		str="hi";
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
		}
		// a = start
		//b = a
		//a = new value
		//x = 3; x is our first a
		int b=x;
		x=1;
		System.out.println("b:" +b);

		//start value was "hi"
		String bStr = str;
		str= "hi there";
		System.out.println("bStr:" +bStr);

		int[] arr2= arr;
		for (int i=0; i<arr.length; i++) {
			arr[i]=0;
		}
		System.out.println("arr2:" + Arrays.toString(arr));


	}

}


