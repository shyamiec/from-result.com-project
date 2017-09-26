class state
{
	static int count=0;
	Test()
	{
		count++;
	}
	public static void main(String ar[])
	{
		Test y=new Test();
		Test y1=new Test();
		System.out.println("total="+count+"object created" );
     		
	}
}