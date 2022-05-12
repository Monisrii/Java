package week1.day2;

public class Car {
public void driverCar()
{
	System.out.println("Driver car");
}
public void applyBreak()
{
	System.out.println("Apply Break");
}
public void SwitchOnAc()
{
	System.out.println("Switch OnAc");
}
public static void main(String[]args)
{
	Car car=new Car();
	car.driverCar();
	car.applyBreak();
	car.SwitchOnAc();
}
}