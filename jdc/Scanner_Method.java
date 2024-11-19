import java.util.Scanner;
class Scanner_Method {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		System.out.println("My Name is : "+ name);

		in.close();
	}
}