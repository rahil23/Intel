package arrayList;

import java.util.ArrayList;

public class UserDefinedCollection {
	
	int id;
	String name,author,title;
	
	public UserDefinedCollection(int id,String name,String title,String author)
	{
		this.id=id;
		this.name=name;
		this.title=title;
		this.author=author;
	}
	}

class CustomArrayList
{
	public static void main(String[] args) {
//Creating list
		ArrayList<UserDefinedCollection> l1 = new ArrayList<UserDefinedCollection>();
	
		//creating books
		
	UserDefinedCollection book1 = new UserDefinedCollection(12, "C++", "oops", "Author1");
	UserDefinedCollection book2 = new UserDefinedCollection(13, "Java", "multithreading", "Author2");
	UserDefinedCollection book3 = new UserDefinedCollection(14, "DBMS", "CRUD Queries", "Author3");
	UserDefinedCollection book4 = new UserDefinedCollection(13, "OS", "Scheduling", "Author4");
l1.add(book1);
l1.add(book2);
l1.add(book3);
l1.add(book4);

for(UserDefinedCollection book : l1)
{
	System.out.println(book.id+" "+ book.name+ " "+book.author+" "+book.title);
}

	
	}
}