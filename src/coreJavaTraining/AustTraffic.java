package coreJavaTraining;

public class AustTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a=new AustTraffic();
		AustTraffic at=new AustTraffic();
		ContinentalTraffic ct=new AustTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		at.walkingSymbol();
		ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go impl");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop impl");

	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash yellow impl");
	}
	
	public void walkingSymbol()
	{
		System.out.println("Walking");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train");
	}

}
