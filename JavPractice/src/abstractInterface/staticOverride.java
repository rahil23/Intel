package abstractInterface;

 class child
{
	public static void main(String[] args) {
		System.out.println("child class");
	}
}

public class staticOverride extends child {
	public static void main(String[] args) {
		System.out.println("overridden child method Class");
	}

}
