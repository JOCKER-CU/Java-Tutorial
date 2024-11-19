import java.util.Scanner;
class ScannerEx1 {
	public static void main(String[] args) {
		
		String s = "Hello, This is JavaTPoint.";

		Scanner sc = new Scanner(s);

		System.out.println("Boolean Result: " + sc.hasNext());

		System.out.println("String: " + sc.nextLine());

		sc.close();

		System.out.println("-----Enter Your Details-----");

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your name:");

		String name = in.next();

		System.out.println("Name :" + name);

		System.out.println("Enter your age : ");
		int i = in.nextInt();

		System.out.println("Age : "+ i );

		System.out.println("Enter Your Salary: ");
		double d = in.nextDouble();

		System.out.println("Salary: " + d);
		in.close();
	}
}