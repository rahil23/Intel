package set;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CustomClass {
	
	int number;
	String aName,edition,title;
	
	public CustomClass(int number,String aName,String edition,String title) {
		
		this.number=number;
		this.aName=aName;
		this.edition=edition;
		this.title=title; 
		// TODO Auto-generated constructor stub
	}

}
class CustomObj
{
	public static void main(String[] args) {
		HashSet<CustomClass> set = new HashSet<CustomClass>();
		
		//creating books
		
		CustomClass b1 = new CustomClass(1, "Name1", "1st", "title1");
		CustomClass b2 = new CustomClass(2, "name2", "2nd", "title2");
		CustomClass b3 = new CustomClass(3, "name3", "3rd", "title3");
		CustomClass b4 = new CustomClass(2, "name2", "2nd", "title2");
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		

		
		for (CustomClass customClass : set) {
System.out.println(customClass.aName+ "  "+customClass.number+ "  "+customClass.edition+ "  "+customClass.title);			
		}
		
		}
		
	}
