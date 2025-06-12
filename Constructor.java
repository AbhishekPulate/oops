class Constructor
{
	String name;
	long phno ;
	int age ;
	String location ;
	String email ;
	
	String blood ;
	String tempLoc ;
	long tel ;

	Constructor ()
	{
	}

	Constructor(String name,long phno,int age,String loc,String email)
	{
		this.name = name;
		this.phno = phno ;
		this.age = age;
		location = loc;
		this.email = email;
	}

	Constructor(String name,long phno,int age,String loc,String email,String blood)
	{
		this(name,phno,age,loc,email);
		this.blood = blood;
	}
	Constructor(String name,long phno,int age,String loc,String email,String blood,String tempLoc)
	{
		this(name,phno,age,loc,email,blood);
		this.tempLoc =tempLoc;
	}
	Constructor(String name,long phno,int age,String loc,String email,String blood,String tempLoc,long tel)
	{
		this(name,phno,age,loc,email,blood,tempLoc);
		this.tel = tel;
	}

	public void displayForm()
	{
		System.out.println("Name: "+name);
		System.out.println("Phno: "+phno);
		System.out.println("age: "+age);
		System.out.println("Location: "+location);
		System.out.println("Email: "+email);
		System.out.println("Blood: "+blood);
		System.out.println("Temp Location: "+tempLoc);
		System.out.println("tel: "+tel);
	}
}
