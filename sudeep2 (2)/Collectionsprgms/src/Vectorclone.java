import java.util.Vector;


public class Vectorclone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> vc = new Vector<String>();

vc.add("ram");
vc.add("rahim");
vc.add("ram");

System.out.println(vc);

Vector<String> copy= (Vector<String>) vc.clone(); 
System.out.println(copy);
	}

}
