package map;

import java.util.HashMap;

public class StudentPojo {

	int rollno;
	String FName,Lname;
	
	StudentPojo(int rollno , String Fname , String Lname)
	{
		this.rollno=rollno;
		this.FName = Fname;
		this.Lname=Lname;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FName == null) ? 0 : FName.hashCode());
		result = prime * result + ((Lname == null) ? 0 : Lname.hashCode());
		result = prime * result + rollno;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPojo other = (StudentPojo) obj;
		if (FName == null) {
			if (other.FName != null)
				return false;
		} else if (!FName.equals(other.FName))
			return false;
		if (Lname == null) {
			if (other.Lname != null)
				return false;
		} else if (!Lname.equals(other.Lname))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "StudentPojo [rollno=" + rollno + ", FName=" + FName + ", Lname=" + Lname + "]";
	}
	

}
