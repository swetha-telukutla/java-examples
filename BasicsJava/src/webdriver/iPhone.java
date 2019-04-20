package webdriver;

public class iPhone extends Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
iPhone i =  new iPhone();
i.makeACAll();
i.receiveACall();
i.sendMSG();
i.takeAPic();
i.downLoadApp();
	}
	//over ridden method
	public void makeAcall(){
	System.out.println("iphone is make a call");
	}
	//overloaded method
	public void downLoadApp(){
		System.out.println("iphone is  downloading app");
	}
	public void downLoadApp(int a){
		System.out.println("counting the no of downloaded apps");
	}
}
