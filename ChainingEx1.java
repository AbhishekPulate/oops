class ChainingEx1
{
	String name =	"CELLO" ;
	double price = 5;
	int cap = 10;

	public ChainingEx1 m1()
	{
		System.out.println("NAME: "+name);
		return this;
	}
	public ChainingEx1 m2()
	{
		System.out.println("PRICE: "+price);
		return this;
	}
	public ChainingEx1 m3()
	{
		System.out.println("CAPACITY: "+cap);
		return this;
	}
}
