package week1.day3;

public class Primeiscorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=11;
     int count=0;
     for(int i=1;i<=a;i++)
     {
    	 if(a%i==0) {
    		 count++;
    	 }
    	 if(count==2)
    		 System.out.println("Prime");
    	 else
    		 System.out.println("not prime");
	}
     

}}
