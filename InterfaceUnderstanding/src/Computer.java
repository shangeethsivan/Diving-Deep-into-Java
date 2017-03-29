
/*
 *Shangeeth Sivan
 *05-Mar-2017 
 *InterfaceUnderstanding
 */
import static java.lang.System.out;

public class Computer {

	int abb = 10;
	static int a=add(1,3);
	
	static{
		System.out.println("Static block");
	}
	{
		System.out.println("test");
	}

	private static void playMovie(CompactDiskPlayer player) {
		player.play();
	}

	private static void playDVD(Dvdplayer player) {
		player.play();
	}

	public static void add(int abcd) {
		abcd++;
	}

	public static void arraySort(int[] arr) {
		arr[3] = 10;
	}

	public static int add(int a,int b){
		System.out.println("add called");
		return a+b;
	}
	public static void main(String[] args) {
		// int a = 111111111;
		// out.println(a);

		Computer computer = new Computer();
		Computer computer2 = new Computer();
		Computer computer3 = new Computer();
		
		playMovie(new HarryPotter());
		playMovie(new PK());

		System.out.println(a);
		//
		//
		// playDVD(new HarryPotter());
		// int a = 2;
		// int b = a;
		//
		// b = 3;
		// add(a);
		// out.println(a);
		//
		// int arr[] = { 1, 2, 3, 4, 5, 6 };
		// int newarr[] = arr;
		// newarr[0] = 3;
		// // arraySort(arr);
		// for (int temp : arr) {
		// out.println(temp);
		// }
	}
}
