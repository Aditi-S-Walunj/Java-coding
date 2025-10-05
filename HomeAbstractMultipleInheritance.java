package abc;

abstract class  Device{
	abstract void turnOn();
	abstract void turnOff();
}
interface Connectable{
	void connectWifi();
}
interface VoiceControl{
	void acceptVoiceCommand(String command);
}
class SmartLight extends Device implements Connectable,VoiceControl{
    @Override
	void turnOn() {
	    System.out.println("Smart Light is now ON.");
	 }
    @Override
    void turnOff() {
	   System.out.println("Smart Light is now OFF.");
   }
   @Override
   public void connectWifi() {
	   System.out.println("Smart Light connected to Wi-Fi.");
   }
   @Override
   public void acceptVoiceCommand(String command) {
	   System.out.println("Smart Light received voice command: " + command);
   }
}
class SmartSpeaker extends Device implements Connectable,VoiceControl{
	@Override
	 void turnOn() {
	        System.out.println("Smart Speaker is now ON.");
	 }
	@Override
	 void turnOff() {
	        System.out.println("Smart Speaker is now OFF.");
	 }
	@Override
	public void connectWifi() {
		System.out.println("Smart Speaker connected to Wi-Fi.");
	}
	public void acceptVoiceCommand(String command) {
		System.out.println("Smart Speaker processing voice command: " + command);
	}	
}
public class HomeAbstractMultipleInheritance {
public static void main(String[] args) {
	Connectable c1=new SmartLight();
	Connectable c2=new SmartSpeaker();
	c1.connectWifi();
	c2.connectWifi();
	  VoiceControl v1 = new SmartLight();
      VoiceControl v2 = new SmartSpeaker();
      v1.acceptVoiceCommand("Turn on the light");
      v2.acceptVoiceCommand("Play music");
}
}
