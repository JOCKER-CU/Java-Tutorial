import java.util.Scanner;
class ScannerEx2 {
	public static void main(String[] args) {
		String str = "Hello/This is JavaTPoint/My name is Abhishek./I am Programmer.";

		Scanner sc = new Scanner(str);

		System.out.println("Boolean Result: "+ sc.hasNextBoolean());

		sc.useDelimiter("/");

		System.out.println("-----Tokenizes String -----");

		while(sc.hasNext()){
			System.out.println(sc.next());
		}

		System.out.println("Delimiter used:" + sc.delimiter());
		sc.close();
	}
}