package week1.day3;

public class Tables {
public void mul(int i,int b)
{
	for(int n=i;n<=10;i++)
	{
		int a=n*b;
		System.out.println(n+"*"+b+"="+a);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables object=new Tables();
		object.mul(1,2);
		

	}

}
