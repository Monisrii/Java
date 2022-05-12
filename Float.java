package week1.day2;

public class Float {
public float add(float a,float b)
{
	float c=a+b;
	return c;
}
public void sub(float value,float b)
{
	float c=value-b;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float obj=new Float();
		float value=obj.add(10, 10);
		System.out.println(value);
		obj.sub(value, 5);
	}
}
