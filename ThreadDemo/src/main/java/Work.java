/**
 * @author Shangeeth Sivan
 * @date 27-Mar-2017
 * @category ThreadDemo
 */
public class Work implements Runnable {
	String dummy = "";

	public Work(String dummy) {
		super();
		this.dummy = dummy;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			(new Thread(new Work(i + "th Thread"))).start();
		}
	}

	public void run() {
		System.out.println(dummy);
	}

}
