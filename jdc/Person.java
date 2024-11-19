public class Person{

	String name;
	public static void main(String[] args) {
		System.out.println("Han Naung Soe");
		Person p = new  Person();
		p.name = "Aye Aye";
		p.show("Han Naung Soe");
		System.out.println(p.name);
		

	}

	public void show( String name){
		System.out.println(name);
	}
}