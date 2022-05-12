package week1.day4;

public class MobileClass {
public void sendMessage()
{
	String message="hi";
	System.out.println("Message content:"+message);
}
public void shareDocument()
{
	String document="microsoft";
	System.out.println("Document is:"+document);
}
public void call()
{
	String call="moni";
	System.out.println("call to:"+call);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileClass obj=new MobileClass();
	obj.sendMessage();
	obj.shareDocument();
	obj.call();

	}

}
