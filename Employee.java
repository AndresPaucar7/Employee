
public class Employee {
	private String usersName;	
	private int usersIdNumber;		
	private String usersDepartment; 
	private String usersPosition;


	public Employee() 
	{
		usersName = "";
		usersDepartment = "";
		usersPosition = "";
		usersIdNumber = 0;
		
	}
	

public Employee(String n, int id, String dept, String posit) {
	usersName = n;
	usersIdNumber = 0;
	usersDepartment = "";
	usersPosition = "";
	}

    public Employee(String n, int id) {
	usersName = n;
	usersIdNumber = id;
	usersDepartment = "";
	usersPosition = "";
}


public void setName(String n)
{
	usersName = n;
}

public void setIdNumber(int number)
{
	usersIdNumber = number;
}

public void setDepartment(String dep)
{
	usersDepartment = dep;
}

public void setPosition(String pos)
{
	usersPosition = pos;
}

public String getName()
{
	return usersName;
}
public int getIdNumber()
{
	return usersIdNumber;
}
public int getNumber() 
{
	return usersIdNumber;
}
public String getDepartment()
{
	return usersDepartment;
}
public String getposition()
{
	return usersPosition;
}
}
